import java.util.Arrays;
import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number : ");
        int n = sc.nextInt();
        System.out.println("The smallest number is : " + smallestNumber(n));
        sc.close();
    }

    public static int smallestNumber(int num){
        if (num == 0) return 0;

        boolean isNegative = num < 0;
        char[] digits = Integer.toString(Math.abs(num)).toCharArray();
        Arrays.sort(digits);
        if(isNegative) {
            reverse(digits);
            return -Integer.parseInt(new String(digits));
        } else {
            if (digits[0] == '0') {
                for (int i = 1; i < digits.length; i++) {
                    if (digits[i] != '0') {
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            }
            return Integer.parseInt(new String(digits));
        }
    }

    public static void reverse(char[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
