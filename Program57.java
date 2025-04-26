import java.util.HashMap;

public class Program57 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2};
        int result = ckeckArray(arr);
        if(result == 1){
            System.out.println("The array is sorted in non-decreasing order and all elements occur at least 3 times.");
        } else {
            System.out.println("The array does not meet the criteria.");
        }
    }

    public static int ckeckArray(int[] arr) {
        int n = arr.length;

        // 1. Check if array is sorted in non-decreasing order
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < arr[i - 1]) return 0;
        }

        // 2. Count occurrences of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }
        // 3. Check if all elements occur at least 3 times
        for(int count : countMap.values()){
            if(count < 3) return 0;
        }

        return 1;
    }
}
