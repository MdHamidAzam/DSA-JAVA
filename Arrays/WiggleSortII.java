package Arrays;

import java.util.*;

public class WiggleSortII {
    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] temp = new int[n];
        int left = (n-1)/2;
        int high = n-1;

        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                temp[i] = nums[left--];
            } else {
                temp[i] = nums[high--];
            }
        }

        for(int i=0; i<n; i++) {
            nums[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = { 1, 5, 1, 1, 6, 4 };
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
