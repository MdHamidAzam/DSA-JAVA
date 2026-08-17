package Arrays;

public class MedianofTwoSortedArrays {
    public static double MedianofTwoSortedArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2)
            return MedianofTwoSortedArray(nums1, nums2);

        int low = 0;
        int high = n1;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = (n1 + n2 + 1) / 2 - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 1)
                    return Math.max(l1, l2);
                return Math.max(l1, l2) + Math.max(r1, r2) / 2.0;
            } else if (l1 > r2)
                high = mid1 - 1;
            else
                low = mid1 + 1;

        }

        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 8 };
        int[] nums2 = { 2, 7, 10, 12 };
        System.out.println(MedianofTwoSortedArray(nums1, nums2));
    }
}
