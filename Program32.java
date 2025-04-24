public class Program32 {

    public static int partition(int a[], int low , int high){
        int curr = a[low];
        int j = high;
        for(int i = j ; i >= low ; i--){
            if(curr < a[i]){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j--;
            }
        }
        int temp = a[j];
        a[j] = a[low];
        a[low] = temp;
        return j;
    }

    public static void quickSort(int a[], int low , int high){
        if(low < high){
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 2, 3};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
