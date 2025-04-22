//WAP to convert a Binary to Decimal.

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary string : ");
        String str = sc.nextLine();

        int ans = 0;

        for(char c : str.toCharArray()){
            ans = ans * 2 + (c - '0');
        }

        System.out.println(ans);

        sc.close();
    }
}
