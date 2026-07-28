package Arrays;

public class ProductOfArrayExceptSelf {
    public static void ProductOfArrayExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int suffix = 1;
        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix = suffix * nums[i + 1];
            ans[i] = ans[i] * suffix;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        ProductOfArrayExceptSelf(nums);
    }
}
