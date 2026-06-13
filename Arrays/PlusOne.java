package Arrays;

public class PlusOne {
    public static void PlusOne(int[] arr) {
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 9) {
                arr[i] = 0;
            } else {
                arr[i]++;
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                return;
            }
        }

        arr = new int[arr.length + 1];
        arr[0] = 1;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 9, 9, 9};
        PlusOne(arr);
    }
}
