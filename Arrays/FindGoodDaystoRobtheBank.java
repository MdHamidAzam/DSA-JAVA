package Arrays;

import java.util.*;

public class FindGoodDaystoRobtheBank {
    public static List<Integer> goodDayToRobTheBank(int[] security, int time) {
        int n = security.length;
        List<Integer> ans = new ArrayList<>();
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++) {
            if (security[i - 1] >= security[i]) {
                left[i] = left[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (left[i] >= time && right[i] >= time) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] security = { 5, 3, 3, 3, 5, 6, 2 };
        System.out.println(goodDayToRobTheBank(security, 2));
    }
}
