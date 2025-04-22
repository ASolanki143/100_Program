// bubble sort
// Time complexity: O(n^2)
// Space complexity: O(1)
// Stable: Yes
// In-place: Yes
// Best case: O(n)
// Worst case: O(n^2)
// Average case: O(n^2)
public class Program16 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    // swap arr[j] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if(!swapped){
                break;
            }
            swapped = false;
        }
    }
}
