package Arrays;

public class RotateArray {
    public static void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void RotateArray(int[] nums) {
        int n = nums.length;
        int k = 3;
        k = k % n;
        int i = 0;
        int j = n - 1;

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        RotateArray(nums);
    }
}
