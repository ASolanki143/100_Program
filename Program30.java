// WAP to convert a Decimal to Binary.

import java.util.Scanner;

public class Program30 {

    public static String convertDtoB(int n){
        StringBuilder ans = new StringBuilder();

        while(n != 0){
            ans.append(n % 2);
            n /= 2;
        }

        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Binary : "+convertDtoB(number));
        sc.close();
    }
}
