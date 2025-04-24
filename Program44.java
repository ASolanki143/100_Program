import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in octal format:");
        String octalString = sc.nextLine();
        System.out.println("Hexadecimal equivalent: " + octalToHexadecimal(octalString));
        sc.close();
    }

    public static String octalToHexadecimal(String octalString){
        int decimalValue = Program46.octalToDecimal(octalString);
        String hexaString = Program47.decimalToHexa(decimalValue);
        return hexaString;
    }
}
