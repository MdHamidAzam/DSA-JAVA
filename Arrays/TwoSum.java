package Arrays;

public class TwoSum {
    public static void TwoSum(int[] arr, int target) {
        // int[] ans = new int[2];

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        TwoSum(arr, 18);
    }
}
