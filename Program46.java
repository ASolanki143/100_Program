import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String octal = decimalToOctal(decimal);
        System.out.println("Decimal to Octal: " + octal);
        System.out.println("Octal to Decimal: " + octalToDecimal(octal));
        sc.close();
    }

    public static String decimalToOctal(int decimal){
        String octal = "";
        while(decimal > 0){
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal = decimal / 8;
        }
        return octal.equals("") ? "0" : octal;
    }

    public static int octalToDecimal(String octal){
        int decimal = 0;
        int base = 1;
        for(int i = octal.length() - 1; i >= 0; i--){
            char digit = octal.charAt(i);
            decimal += (digit - '0') * base;
            base *= 8;
        }
        return decimal;
    }
}
