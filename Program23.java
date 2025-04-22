import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be inserted:");
        int x = sc.nextInt();
        System.out.println("Enter the position at which to insert the element:");
        int pos = sc.nextInt();
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position");
        } else {
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = x;

            System.out.println("Array after insertion:");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
