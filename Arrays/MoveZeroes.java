package Arrays;

public class MoveZeroes {
    public static void MoveZeroes(int[] arr) {
        int NoOfZero = 0;
        int n = arr.length;

        for(int ele : arr) {
            if(ele == 0) NoOfZero++;
        }

        for(int x=0; x<NoOfZero; x++) {
            for(int i=0; i<n-x-1; i++) {
                if(arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        // Two pointer Approah
        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] != 0) {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         j++;
        //     }
        // }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        MoveZeroes(arr);

        for(int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
