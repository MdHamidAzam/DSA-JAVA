package Strings;

public class GCDofString {
    public static String GCD(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        if(!(str1 + str2).equals(str2 + str1)) return "";

        while(n != 0) {
            int temp = n;
            n = m%n;
            m = temp;
        }

        return str1.substring(0, m);
    }
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(GCD(str1, str2));
    }
}
