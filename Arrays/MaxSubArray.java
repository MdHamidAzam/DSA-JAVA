package Arrays;

public class MaxSubArray {
    public static void kadane(int[] arr) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<arr.length; i++) {
            cs += arr[i];

            ms = Math.max(cs, ms); //for all negative Array

            if(cs < 0) {
                cs = 0;
            }
        }

        System.out.println("The maximum sum of subarray is: "+ms);
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(arr);
    }
}
