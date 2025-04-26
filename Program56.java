public class Program56 {
    public static void main(String[] args) {
        int[] nums = {2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(nums)); // Output: 3
    }

    public static int minimumAverageDifference(int[] nums){
        int n = nums.length;
        long totalSum = 0;
        for(int x : nums) totalSum += x;

        long leftSum = 0;
        int minIndex = -1;
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            leftSum += nums[i];
            long leftAvg = leftSum / (i + 1);
            long rightAvg = (i == n - 1) ? 0 : (totalSum - leftSum) / (n - i - 1);
            int diff = (int) Math.abs(leftAvg - rightAvg);

            if(diff < minDiff){
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
