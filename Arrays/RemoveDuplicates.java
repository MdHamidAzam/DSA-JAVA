package Arrays;

public class RemoveDuplicates {
    public static void RemoveDuplicates(int[] arr) {
        int j = 0;
        int n = arr.length;

        for(int i=0; i<n; i++) {
            if(arr[j] !=arr[i]) {
                arr[++j] = arr[i];
            }
        }

        System.out.println(j+1);
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates(arr);
    }
}
