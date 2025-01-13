// WAP to find a Factor of a given number (iterative and recursive)

import java.util.Scanner;

public class Program3 {

    public static void findFactor(int n, int i) {
        if (n < i) {
            return;
        }
        if (n % i == 0) {
            System.out.print(i + " ");
        }
        findFactor(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Using iterative method : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Using recursive method : ");
        findFactor(n, 1);

        sc.close();
    }
}
