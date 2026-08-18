package Strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        int m = strs.length;
        int n = first.length();

        for(int i=0; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(i >= strs[j].length()) return first.substring(0,i);
                if(first.charAt(i) != strs[j].charAt(i)) return first.substring(0,i);
            }
        }

        return first;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
