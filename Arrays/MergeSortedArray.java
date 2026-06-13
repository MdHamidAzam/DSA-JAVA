package Arrays;

public class MergeSortedArray {
    public static void MergeSortedArray(int[] arr, int[] brr) {
        int m = 3;
        int n = brr.length;

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0) {
            if(arr[i] > brr[j]) {
                arr[k] = arr[i];
                i--;
            } else {
                arr[k] = brr[j];
                j--;
            }
            k--;
        }

        while(j>=0) {
            arr[k] = brr[j];
            j--;
            k--;
        }

        for(i=0; i<m+n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,0,0};
        int brr[] = {2,5,6};
        MergeSortedArray(arr, brr);
    }
}
