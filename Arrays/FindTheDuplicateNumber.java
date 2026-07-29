package Arrays;

public class FindTheDuplicateNumber {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void FindTheDuplicateNumber(int[] nums) {

        while (true) {
            int ele = nums[0];
            if (nums[ele] == ele) {
                System.out.println(ele);
                return;
            }
            swap(nums, ele, 0);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        FindTheDuplicateNumber(nums);
    }
}
