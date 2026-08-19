package Strings;

public class FirstUniqueChar {
    public static int firstUniqueChar(String str) {
        // Method 1 
    //     int n = str.length();

    //     for(int i=0; i<n; i++) {
    //         if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) return i;
    //     }

    //     return -1;
    // }

    // Method 2
    int n = str.length();
    int[] freq = new int[26];

    for(int i=0; i<n; i++) {
        freq[str.charAt(i) - 'a']++;
    }

    for(int i=0; i<n; i++) {
        if(freq[str.charAt(i) - 'a'] == 1) return i;
    }
    return -1;
}
public static void main(String[] args) {
    String str = "leetcode";
    System.out.println(firstUniqueChar(str));
    }
}
