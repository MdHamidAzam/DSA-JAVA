package Arrays;

import java.util.ArrayList;

public class DisappearedNumber {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void DisappearedNumber(int[] arr) {
        // ArrayList<Integer> arr = new ArayList<>();
        int i = 0;
        while (i < arr.length) {
            int ele = arr[i];

            if (arr[i] == i + 1 || arr[i] == arr[ele - 1]) {
                i++;
            } else {
                swap(arr, ele - 1, i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        DisappearedNumber(arr);
    }
}
