// WAP to find whether string is palindrome or not.

import java.util.Scanner;

public class Program2 {

    public static boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        if (checkPalindrome(str))
            System.out.println("Given String is palindrome");
        else
            System.out.println("Given string is not palindrome");
        sc.close();
    }
}
