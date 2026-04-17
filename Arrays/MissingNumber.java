package Arrays;

public class MissingNumber {
    public static void MissingNumber(int[] arr) {
        int sum = 0;
        int n = arr.length;
        
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        int actualSum = n*(n+1)/2;
        int missingNumber = actualSum - sum;
        System.out.println(missingNumber);
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        MissingNumber(arr);
    }
}
