// WAP to find a summation of a digit of a given number. (Iterative and recursive)

import java.util.Scanner;

public class Program5 {

    public static int findSum(int n) {
        if (n == 0)
            return n;
        return n % 10 + findSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Using recursion method : ");
        System.out.println(findSum(n));

        System.out.println("Using iterative method : ");
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);

        sc.close();
    }
}
