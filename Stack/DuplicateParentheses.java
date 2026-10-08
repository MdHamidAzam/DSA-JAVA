package Stack;

import java.util.*;

public class DuplicateParentheses {
    public static boolean duplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == ')') {
                int count = 0;

                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if(count < 1) return true;
                else s.pop();
            } else s.push(ch);
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(duplicateParentheses(str));
    }
}
