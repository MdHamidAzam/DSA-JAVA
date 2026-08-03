package Arrays;

public class NextPermutations {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void nextPermutations(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for (int i = n - 2; i > 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot + 1, n - 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        System.out.println("Before Next Permutation");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        nextPermutations(nums);
        System.out.println("After Next Permutation");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
