// WAP to find a factorial of a given integer (iterative and recursive)

import java.util.Scanner;

public class Program4 {

    public static int findFactorial(int n) {
        if (n == 1)
            return 1;
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Using iterative : ");
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        System.out.println(fact);

        System.out.println("Using recursion : ");
        System.out.println(findFactorial(n));

        sc.close();
    }
}
