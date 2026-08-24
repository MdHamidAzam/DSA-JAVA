package Strings;

import java.util.*;

public class PalindromePartitioning {
    private static boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
    
    private static void backtrack(int start, String s, List<String> path, List<List<String>> ans) {
        int n = s.length();

        if(start == n) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int end=start; end<n; end++) {
            if(!isPalindrome(s, start, end)) continue;

            path.add(s.substring(start, end+1));

            backtrack(end+1, s, path, ans);

            path.remove(path.size() - 1);
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        backtrack(0, s, path, ans);

        return ans;
    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
}
