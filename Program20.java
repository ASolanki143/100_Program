public class Program20 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(power(a, b));
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            int halfPower = power(a, b / 2);
            return halfPower * halfPower;
        } else {
            return a * power(a, b - 1);
        }
    }
}