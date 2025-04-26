import java.util.HashSet;
import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (isHappyNumber(n)) {
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
        sc.close();
    }

    public static boolean isHappyNumber(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1) {
                return true;
            }
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
    }

    public static int numSquareSum(int n){
        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans += digit * digit;
            n /= 10;
        }
        return ans;
    }
    
}
