package Arrays;

import java. util.*;

public class KthSmallestPairDistance {
    private static int countPairs(int[] nums, int maxDistance) {
        int n =nums.length;
        int count = 0;
        int j = 0;


        for(int i=0; i<n; i++) {
            while(nums[i] - nums[j] > maxDistance) j++;
            count += i-j; 
        }

        return count;
    }
    public static int pairDistance(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int low = 0;
        int high = nums[n-1] - nums[0];

        while(low < high) {
            int mid = low + (high - low) / 2;
            int count = countPairs(nums, mid);

            if(count >= k) high = mid;
            else low = mid + 1;
            
        }

        return low;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 10 };
        System.out.println(pairDistance(nums, 3));
    }
}
