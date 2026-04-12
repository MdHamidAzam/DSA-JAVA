package Arrays;

public class MajorityElement {
    public static void majority(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Time complexity: 0(n)
        // Space complexity: 0(1)
        // Boyer-Moore Algorithm
        for(int i=0; i<arr.length; i++) {
            if(count == 0) {
                candidate = arr[i];
            }
            if(candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Brute force Approach
        // Time complexity: 0(n^2)
        // Space complexity: 0(1)
        for(int i=0; i<arr.length; i++) {
            int coun = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    coun++;
                }
            }
            if(coun > arr.length/2) {
                System.out.println(arr[i]);
                break;
            }
        }
        System.out.println("The candidate key are: "+candidate);
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        majority(arr);
    }
}
