import java.util.Scanner;

public class Program39 {

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();

        System.out.println("Enter a value of K : ");
        int k = sc.nextInt();

        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);

        for(int i : arr) System.out.print(i + " ");

        sc.close();
    }
}
