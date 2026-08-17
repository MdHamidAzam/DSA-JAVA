package Strings;

public class DefangingIPAddress {
    public static String DefangingIPAddress(String str) {
        str = str.replace(".","[.]");

        return str;
    }
    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(DefangingIPAddress(str));
    }
}
