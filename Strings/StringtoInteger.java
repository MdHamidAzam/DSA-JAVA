package Strings;

public class StringtoInteger {
    public static int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        while(i<n && s.charAt(i) == ' ') i++;

        int sign = 1;
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i) == '-') sign = -1;
        i++;
        }

        long num = 0;
        while(i<n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if(num > Integer.MAX_VALUE/10 ||
               num == Integer.MAX_VALUE/10 && digit > 7) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
               }

               num = num * 10 + digit;
               i++;
        }

        return (int) (sign * num);
    }
    public static void main(String[] args) {
        String s = " -042";
        System.out.println(myAtoi(s));
    }
}
