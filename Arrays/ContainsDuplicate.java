package Arrays;

public class ContainsDuplicate {
    public static void ContainsDuplicate(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        ContainsDuplicate(arr);
    }
}
