package Strings;

public class ReorganizeString {
    public static String reorganizeString(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxFreq = 0;
        int maxChar = 0;

        for(int i=0; i<26; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = i;
            }
        }

        if(maxFreq > (n+1)/2) return "";

        char[] result = new char[n];
        int index = 0;
        while(freq[maxChar] > 0) {
            result[index] = (char) ('a' + maxChar);
            freq[maxChar]--;
            index += 2;
        }

        for(int i=0; i<26; i++) {
            while(freq[i] > 0) {
                if(index >= n) index = 1;
                result[index] = (char) ('a' + i);
                freq[i]--;
                index += 2;
            }
        }

        return new String(result);
    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganizeString(s));
    }
}
