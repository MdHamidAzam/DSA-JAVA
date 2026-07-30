package Arrays;

import java.util.*;

public class PascalTriangle {

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // Create rows
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            ans.add(row);
        }

        // Fill middle elements
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                ans.get(i).set(j,
                        ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        List<List<Integer>> result = generate(n);

        System.out.println("\nPascal's Triangle:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}
