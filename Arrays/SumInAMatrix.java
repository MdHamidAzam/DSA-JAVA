package Arrays;

import java.util.*;

public class SumInAMatrix {
    public static void MaxSumInMatrix(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            Arrays.sort(nums[i]);
        }

        // int sum = 0;
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, nums[i][j]);
            }

            sum += max;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 7, 2, 1 },
                { 6, 4, 2 },
                { 6, 5, 3 },
                { 3, 2, 1 } };

        MaxSumInMatrix(nums);
    }
}
