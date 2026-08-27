package Strings;

public class LongestPalindromicSubstring {
    private static int expand(String s, int left, int right) {
        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static String longestPalindrome(String s) {
        int n = s.length();

        if (n < 2)
            return s;

        int start = 0;
        int maxlen = 1;

        for (int i = 0; i < n; i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > maxlen) {
                maxlen = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxlen);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
