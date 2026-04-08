package Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int first = 0, last = arr.length - 1;

        while(first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        // Time Complexity = 0(n)
        // Space Complexity = 0(1)
        reverse(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
