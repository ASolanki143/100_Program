// WAP to check weather number is present in array or not (using recursion only) and the
// function’s syntax is given below
// Int isInArray(int a[],int m);
// Where int a[] is Array of integer and m is element to be searched.

import java.util.Scanner;

public class Program25 {

    static int index = 0;
    public static int findIndex(int[] arr, int ele){
        if(index == arr.length) return -1;
        if(arr[index] == ele) return index;
        index++;
        return findIndex(arr, ele);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter an element : ");
        int ele = sc.nextInt();

        System.out.println(findIndex(arr, ele));
        sc.close();

    }
}
