package Strings;

public class LastSubstringinLexicographicalOrder {
    public static String lastSubstring(String s) {
        int n = s.length();

        int i = 0;
        int j = 1;

        while(j < n) {
            int k = 0;
            while(j + k < n && s.charAt(i + k) == s.charAt(j + k)) k++;

            if(j + k == n) break;
            if(s.charAt(i + k) < s.charAt(j + k)) {
                i = Math.max(i + k + 1, j);
            } else j = j + k + 1;
            if(i == j) j++;
        }

        return s.substring(i);
    }
    
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(lastSubstring(s));
    }
}
