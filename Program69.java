import java.util.Scanner;

public class Program69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Output: " + findNthDigit(n));
        sc.close();
    }

    public static int findNthDigit(int n){
        int digit = 1;
        int count = 9;
        int start = 1;

        while(n > digit * count){
            n -= digit * count;
            digit++;
            count *= 10;
            start *= 10;
        }
        System.out.println("Start: " + start);
        System.out.println("N: " + n);
        start += (n - 1) / digit;

        String numStr = Integer.toString(start);
        System.out.println("Digit: " + digit);
        System.out.println("Count: " + count);
        System.out.println("Start: " + start);
        System.out.println(numStr.charAt((n - 1) % digit));
        return Character.getNumericValue(numStr.charAt((n - 1) % digit));
    }
}
