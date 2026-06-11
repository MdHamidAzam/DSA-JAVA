package Arrays;

public class RemoveElements {
    public static void RemoveElements(int[] arr) {
        int j = 0;
        int val = 2;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != val) {
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println(j);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        RemoveElements(arr);
    }
}
