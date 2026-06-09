package Arrays;

public class SquareRoot {
    public static void SquareRoot(int x){
        if(x<=1) {
            System.out.println(x);
            return;
        }

        int low = 0, high = x;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(mid == x/mid) {
                System.out.println(mid);
                return;
            }
            else if(mid > x/mid) high = mid-1;
            else low = mid+1;

            // System.out.println(x);
        }

        System.out.println(high);
    }
    public static void main(String[] args) {
        SquareRoot(25);
    }
}
