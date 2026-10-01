package Stack;

import java.util.*;
public class ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length;
        int idx = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            stack.push(s[i]);
        }

        while(!stack.isEmpty()) {
            s[idx] = stack.pop();
            idx++;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
