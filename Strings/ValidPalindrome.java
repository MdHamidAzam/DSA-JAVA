package Strings;

public class ValidPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]","");
        str = str.toLowerCase();
        int n = str.length();

        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
