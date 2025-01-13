// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
// should be taken from user (Note that you are not allowed to use an array for this)

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter a number : ");
            int x = sc.nextInt();
            min = (min > x) ? x : min;
            max = (max < x) ? x : max;
            sum += x;
        }

        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
        double avg = sum / n;
        System.out.println("Average : "+avg);

        sc.close();
    }
}
