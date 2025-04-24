//Given an array of N integers, and an integer K, find the number of pairs of elements in the 
//array whose sum is equal to K.

import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in the array : ");
        for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();

        System.out.println("Enter a value of K : ");
        int k = sc.nextInt();

        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                if(arr[i] + arr[j] == k) count++;
            }
        }

        System.out.println("Number of pairs of elements in the array whose sum is equal to K : " + count);
        sc.close();
    }
}
