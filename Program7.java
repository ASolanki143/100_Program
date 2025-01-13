// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

import java.util.Scanner;

public class Program7 {

    public static int findFibonacci(int n){
        if(n == 0 || n == 1)
            return n;
        
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.println("Using iterative method : ");
        System.out.print(a + " " + b);
        for(int i = 0; i < n-2; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.println();
        System.out.println("Using recursive method : ");
        for(int i = 0; i < n ; i++){
            System.out.print(findFibonacci(i) + " ");
        }

        sc.close();

    }
}
