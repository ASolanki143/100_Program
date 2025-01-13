// WAP to find a prime number between range (range should be entered by user).

import java.util.Scanner;

public class Program10 {

    public static boolean checkPrime(int n){
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start : ");
        int n1 = sc.nextInt();
        System.out.println("Enter end : ");
        int n2 = sc.nextInt();

        if(n1 > n2){
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }

        for(int i = n1 ; i <= n2 ; i++){
            if(checkPrime(i)) System.out.print(i + " ");
        }

        sc.close();
    }
}
