public class Program74 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 2, 4, 0, 6};
        int k = 4;
        int result = maximumTop(arr, k);
        System.out.println("The maximum top element is: " + result);

    }

    public static int maximumTop(int[] nums, int k){
        int n = nums.length;
        if(k == 0) return nums[0];

        if(n == 1 && k % 2 == 1) return -1;
        if(n == 1) return nums[0];

        if(k > n){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                max = Math.max(max, nums[i]);
            }
            return max;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ;  i < k - 1 ; i++){
            max = Math.max(max, nums[i]);
        }

        if(k < n){
            max = Math.max(max, nums[k]);
        }

        return max;
    }
}
