package Strings;

import java.util.Arrays;

public class StringCanBreakAnotherString {
    public static boolean checkIfCanBreak(String s1,  String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean s1BreakS2 = true;
        boolean s2BreakS1 = true;

        for(int i=0; i<a.length; i++) {
            if(a[i] < b[i]) s1BreakS2 = false;
            if(b[i] < a[i]) s2BreakS1 = false;
        }

        return s1BreakS2 || s2BreakS1;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xya";

        System.out.println(checkIfCanBreak(s1, s2));
    }
}
