package Stack;

import java.util.*;
public class ScoreOfParentheses {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for( char ch : s.toCharArray()) {
            if(ch == '(') stack.push(0);
            else {
                int inner = stack.pop();
                int score = (inner == 0) ? 1 : 2 * inner;
                stack.push(stack.pop() + score);
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
        String s = "(()(()))";
        System.out.println(scoreOfParentheses(s));
    }
}
