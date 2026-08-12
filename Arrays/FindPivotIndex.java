package Arrays;

public class FindPivotIndex {
    public static int PivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum)
                return i;

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 1, -1 };
        System.out.println(PivotIndex(nums));
    }
}
