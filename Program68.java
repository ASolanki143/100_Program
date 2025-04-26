import java.util.Arrays;
import java.util.Scanner;

public class Program68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Minimum number of perfect squares that sum to " + n + " is: " + numsSquare(n));
        sc.close();
    }

    public static int numsSquare(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j * j <= i ; j++){
                dp[i] = Math.min(dp[i] , dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}
