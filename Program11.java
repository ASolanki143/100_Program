// WAP to find weather given number is Armstrong number is not.

import java.util.Scanner;

public class Program11 {

    public static int countDigit(int n) {
        int ans = 0;

        while (n != 0) {
            ans++;
            n /= 10;
        }

        return ans;
    }

    public static boolean isArmstrong(int n) {
        int digit = countDigit(n);

        int ans = 0;
        int temp = n;
        while (temp != 0) {
            ans += Math.pow(temp % 10, digit);
            temp /= 10;
        }

        return ans == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is armstrong number");
        } else {
            System.out.println(n + " is not armstrong number");
        }

        sc.close();
    }
}
