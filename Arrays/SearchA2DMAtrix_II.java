package Arrays;

public class SearchA2DMAtrix_II {
    public static boolean SearchA2DMAtrix_II(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;
        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (nums[i][j] == target) {
                return true;
            } else if (nums[i][j] > target)
                j--;
            else
                i++;
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[][] = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };
        System.out.println(SearchA2DMAtrix_II(nums, 20));
    }
}
