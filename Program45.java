import java.util.Scanner;

public class Program45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number:");
        String hex = sc.nextLine();
        System.out.println("Hexadecimal to octal conversion: "+hexaToOctal(hex));
        sc.close();
    }

    public static String hexaToOctal(String hex){
        int decimal = Program47.hexaToDecimal(hex);
        String octal = Program46.decimalToOctal(decimal);
        return octal;
    }
}
