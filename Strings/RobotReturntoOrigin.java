package Strings;

public class RobotReturntoOrigin {
    public static boolean ReturntoOrigin(String moves) {
        int n = moves.length();
        int x = 0;
        int y = 0;

        for(int i=0; i<n; i++) {
            char ch = moves.charAt(i);

            switch(ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {
        String moves = "UDLR";
        System.out.println(ReturntoOrigin(moves));
    }
}
