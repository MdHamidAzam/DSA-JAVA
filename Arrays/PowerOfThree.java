package Arrays;

public class PowerOfThree {
    public static boolean PowerAOfThree(int n) {
        if(n <= 0) return false;
        while(n%3 == 0) {
            n = n/3;
            if(n == 1) return true;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        System.out.println(PowerAOfThree(27));
    }
}
