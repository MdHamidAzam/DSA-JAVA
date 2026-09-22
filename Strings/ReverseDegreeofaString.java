package Strings;

public class ReverseDegreeofaString {
    public static int reverseDegree(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int revVal = 26 - (s.charAt(i) - 'a');
            int position = i + 1;

            ans += revVal * position;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abc";
        int result = reverseDegree(s);
        System.out.println(result);
    }
}
