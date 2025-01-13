// WAP to find a total odd and total even digit of a given number.

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int oddTotal = 0, evenTotal = 0;

        while(n != 0){
            if((n % 10) % 2 == 0) evenTotal++;
            else oddTotal++;
            n /= 10;
        }

        System.out.println("Odd Digit : "+oddTotal);
        System.out.println("Even Digit : "+evenTotal);

        sc.close();
    }
}
