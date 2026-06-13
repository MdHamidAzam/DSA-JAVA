package Arrays;

public class SingleNumber {
    public static void SingleNumber(int[] arr) {
        int value = 0;
        for(int i=0; i<arr.length; i++) {
            value = value^arr[i];
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 2};
        SingleNumber(arr);
    }
}
