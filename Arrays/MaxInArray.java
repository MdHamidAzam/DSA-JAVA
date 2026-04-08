package Arrays;

public class MaxInArray {
    public static int largestInArray(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5};
        System.out.println("Largest element in the Array is: "+largestInArray(arr));
    }
}
