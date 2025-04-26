import java.util.Scanner;

public class Program53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int xor = a ^ b;
        int count = 0;
        while (xor > 0) {
            count += xor & 1; // Increment count if the last bit is 1
            xor >>= 1; // Right shift to check the next bit
        }
        System.out.println("Number of bits to be flipped: " + count);
        sc.close();
    }
}
