package Strings;

import java.util.Arrays;
import java.util.List;

public class LongestWordinDictionary {
    private static boolean isSubsequence(String s, String word) {
        int i=0; 
        int j=0;

        while(i<s.length() && j<word.length()) {
            if(s.charAt(i) == word.charAt(j)) j++;
            i++;
        }

        return j == word.length();
    }
    public static String findLongestWord(String s, List<String> dictionary) {
        String ans = "";

        for(String word : dictionary) {
            if(isSubsequence(s, word)) {
                if(word.length() > ans.length() ||
                   word.length() == ans.length() && 
                   word.compareTo(ans) < 0) {
                    ans = word;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale","apple","monkey","plea");
        System.out.println(findLongestWord(s, dictionary));
    }
}
