// WAP to find a sum of even number into 1D array.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int evenSum = 0;
        System.out.println("Enter elements of an array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
        }

        System.out.println("Sum of even number : " + evenSum);
        sc.close();
    }
}