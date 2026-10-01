package Stack;

import java.util.*;

public class NextGreatestElementII {
    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int nextGreater[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=2*n-1; i>=0; i--) {
            int idx = i%n;
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[idx]) {
                stack.pop();
            }

            if(i<n) {
                if(stack.isEmpty()) {
                    nextGreater[idx] = -1;
                } else {
                    nextGreater[idx] = nums[stack.peek()];
                }
            }

            stack.push(idx);
        }

        return nextGreater;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = nextGreater(nums);
        System.out.println(Arrays.toString(ans));
    }
}
