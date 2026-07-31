/*
Problem:
1822. Sign of the Product of an Array

Pattern:
Observation + Math

Difficulty:
Easy

Key Learning:
• The problem asks only for the sign, not the actual product.
• Computing the product may cause integer overflow.
• Only two things affect the answer:
  1. Presence of zero
  2. Parity (odd/even) of negative numbers
the information that affects the final answer:
1. Zero
2. Number of negative elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

package Arrays;

public class SignOfTheProductOfArray {
    public static void SignOfTheProductOfArray(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                System.out.println(0);
                return;
            } else if (nums[i] < 0)
                count++;
        }

        if (count % 2 == 1)
            System.out.println(-1);
        else
            System.out.println(1);
    }

    public static void main(String[] args) {
        int nums[] = { -1, -2, -3, -4, 3, 2, 1 };
        SignOfTheProductOfArray(nums);
    }
}
