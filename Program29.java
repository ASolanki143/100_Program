//WAP to find a quotient and reminder of 2 number (bigger number should be divided by
//lower number) and you are not allowed to use a division and quotient operator.

import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        if(n1 < n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int quotient = 0;
        int reminder = 0;

        while(n1 >= n2){
            quotient++;
            n1 -= n2;
            reminder = n1;
        }

        System.out.println("Quotient : "+quotient+ " Remider : "+reminder);
        sc.close();
    }
}
