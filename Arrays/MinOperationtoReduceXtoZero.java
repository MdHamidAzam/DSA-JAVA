package Arrays;

public class MinOperationtoReduceXtoZero {
    public static int minOperations(int[] nums, int x) {
        int totalSum = 0;
        int n = nums.length;

        for(int num : nums) totalSum += num;
        int target = totalSum - x;
        if(target < 0) return -1;
        if(target == 0) return n;
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right=0; right<n; right++) {
            sum += nums[right];

            while(sum > target) {
                sum -= nums[left];
                left++;
            }

            if(sum == target) maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen == 0 ? -1 : n - maxLen;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,20,1,1,3};
        System.out.println(minOperations(nums, 10));

    }
}
