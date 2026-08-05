package Arrays;

public class SumOfSquareNumbers {
    public static boolean squareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c)
                return true;
            else if (sum < c)
                a++;
            else
                b--;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(3));
    }
}
