public class Program22 {
    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
    }

    //    1
    //   A B
    //  2 3 4
    // C D E F
    public static void pattern1() {
        int num = 1;
        char ch = 'A';
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Number
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
    // *********
    //  *******
    //   *****
    //    ***
    //     *

    public static void pattern2() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (n - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *********
    // **** ****
    // ***   ***
    // **     **
    // *       *

    public static void pattern3() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
