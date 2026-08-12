package Arrays;

public class FirstNAndLastPosition {
    public static void FirstAndLastPosition(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2];
        int low = 0;
        int high = n - 1;
        int fp = -1;
        int target = 8;

        // First Position
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if (mid > 0 && arr[mid] == arr[mid - 1])
                    high = mid - 1;
                else {
                    fp = mid;
                    break;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }

        // Reset Pointer
        low = 0;
        high = n - 1;
        // Last Position
        int lp = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if (mid + 1 < n && arr[mid] == arr[mid + 1])
                    low = mid + 1;
                else {
                    lp = mid;
                    break;
                }
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        ans[0] = fp;
        ans[1] = lp;
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        FirstAndLastPosition(arr);
    }
}
