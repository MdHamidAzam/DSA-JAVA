package Arrays;

public class SubArrays {
    public static void printsubaarays(int[] arr) {
        int totalsubarray = 0;
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(arr[k]+" ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total subarray of this Array is: "+totalsubarray);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printsubaarays(arr);
    }
}
