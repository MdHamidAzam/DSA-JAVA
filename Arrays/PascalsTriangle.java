package Arrays;

import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                row.add(1);
            }

            ans.add(row);
        }

        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                ans.get(i).set(j, ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 5;

        List<List<Integer>> result = generate(n);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}