package Strings;

public class NumberofSubstringsWithOnly1s {
    public static int numSub(String s) {
        int n = s.length();
        int count = 0;
        long answer = 0;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '1') {
                count++;
                answer = (answer +count) % 1000000007;
            } else count = 0;
        }

        return (int) answer;
    }
    public static void main(String[] args) {
        String s = "0110111";
        System.out.println(numSub(s));
    }
}
