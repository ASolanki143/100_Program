import java.util.Scanner;

public class Program52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Square root of " + n + " is: " + sqrt(n));
        sc.close();
    }

    public static int sqrt(int n){
        if(n < 2) return n;
        int left = 1;
        int right = n / 2;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid <= n / mid){
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
