public class Program40 {
    public static void main(String[] args) {
        int[] arr = {4,2,3};
        System.out.println(checkPossibility(arr)); // Output: true
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if(i - 2 < 0 || nums[i - 2] <= nums[i]){
                    nums[i - 1] = nums[i];
                }
                else{
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
