package Strings;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;

        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == ' ' && count == 0) continue;
            if(s.charAt(i) == ' ' && count > 0) break;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
