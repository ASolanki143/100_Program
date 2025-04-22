import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be deleted:");
        int elementToDelete = sc.nextInt();
        int index = findElement(arr, elementToDelete);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Reduce the size of the array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }

    public static int findElement(int[] arr, int elementToDelete) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToDelete) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
