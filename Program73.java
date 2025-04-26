import java.util.Scanner;

public class Program73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Number of ways: " + numberOfWays(str));
        sc.close();
    }

    public static int numberOfWays(String s){
        int n = s.length();
        int zeros = 0;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '0'){
                zeros++;
            }
        }
        int ones = n - zeros;
        int ans = 0;

        int currZeros = s.charAt(0) == '0' ? 1 : 0;
        int currOnes = s.charAt(0) == '1' ? 1 : 0;
        for(int i = 1 ; i < n ; i++){
            if(s.charAt(i) == '0'){
                ans += (currOnes * (ones - currOnes));
                currZeros++;
            }
            else{
                ans += (currZeros * (zeros - currZeros));
                currOnes++;
            }
        }
        return ans;
    }
}
