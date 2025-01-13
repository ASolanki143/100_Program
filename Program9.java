// WAP to find whether a number is Odd or Even without using a % operator.

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // Using Bitwise Operator
        if ((n & 1) == 1) {
            System.out.println(n + " is an Odd number.");
        } else {
            System.out.println(n + " is an Even number.");
        }

        // Using multiplication and division
        int quotient = n / 2;
        if (n - (quotient * 2) == 1) {
            System.out.println(n + " is an Odd number.");
        } else {
            System.out.println(n + " is an Even number.");
        }

        sc.close();
    }
}
