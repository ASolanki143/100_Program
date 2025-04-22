// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be
// taken from user).

// angle = (30*H) - (11/2 * M )

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hour hand: ");
        int hour = sc.nextInt();
        System.out.print("Enter the minute hand: ");
        int minute = sc.nextInt();

        double angle = (30 * hour) - (11.0 / 2 * minute);
        System.out.println("The angle between the hour and minute hand is: " + angle);
        sc.close();
    }
}
