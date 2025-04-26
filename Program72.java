import java.util.HashMap;
import java.util.Map;

public class Program72 {
    public static void main(String[] args) {
        int[] arr = {18,43,36,13,7};
        System.out.println(maximumSum(arr)); // Output: 54
    }

    public static int findDigitSum(int n){
        int sum = 0 ;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int maximumSum(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for(int n : arr){
            int digitSum = findDigitSum(n);
            if(map.containsKey(digitSum)){
                maxSum = Math.max(maxSum, n + map.get(digitSum));
            }
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), n));
        }
        return maxSum;
    }
}
