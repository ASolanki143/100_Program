import java.util.Scanner;

public class Program47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String hexa = decimalToHexa(decimal);
        System.out.println("Hexadecimal: " + hexa);
        System.out.println("Decimal: " + hexaToDecimal(hexa));
        sc.close();
    }

    public static String decimalToHexa(int decimal){
        String hexaDegits = "0123456789ABCDEF";
        String hexa = "";
        while(decimal > 0){
            int remainder = decimal % 16;
            hexa = hexaDegits.charAt(remainder) + hexa;
            decimal = decimal / 16;
        }
        return hexa.equals("") ? "0" : hexa;
    }

    public static int hexaToDecimal(String hexa){
        int decimal = 0;
        for(int i = 0; i < hexa.length(); i++){
            char ch = hexa.charAt(i);
            int value = ch >= '0' && ch <= '9' ? ch - '0' : ch - 'A' + 10;
            decimal = decimal * 16 + value;
        }
        return decimal;
    }
}
