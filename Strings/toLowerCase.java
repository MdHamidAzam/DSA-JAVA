package Strings;

public class toLowerCase {
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    //  return str.toLowerCase();
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(toLowerCase(str));

    }
}
