package Arrays;

public class NumberofLaserBeamsInaBank {
    public static int numberOfBeams(String[] bank) {
        int prev = 0;
        int ans = 0;

        for (int i = 0; i < bank.length; i++) {
            String row = bank[i];
            int curr = 0;

            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == '1')
                    curr++;
            }

            if (curr == 0)
                continue;
            ans += prev * curr;
            prev = curr;
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] bank = { "011001", "000000", "010100", "001000" };
        System.out.println(numberOfBeams(bank));
    }
}
