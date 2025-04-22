// WAP to convert a Decimal number to BCD.  

import java.util.Scanner;

public class Program15 {

    public static String convertToBCD(int num) {
        StringBuilder bcd = new StringBuilder();
        for(int i = 0 ; i < 4; i++){
            // if(num > 0){
                bcd.append(num % 2);
                num = num / 2;
            // }
            // else{
            //     bcd.append(0);
            // }
        }

        return bcd.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String ans = "";

        while(n != 0){
            ans = convertToBCD(n%10) + " " + ans;
            n = n/10;
        }

        System.out.println("Ans : "+ans);
        sc.close();
    }
}
