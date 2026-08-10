package Arrays;

public class BuyAndSellStock {
    public static void BuyAndSellStock(int[] arr) {
        int min = Integer.MAX_VALUE;
        int mp = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] - min > mp) {
                mp = arr[i] - min;
            }
        }
        System.out.println(mp);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        BuyAndSellStock(arr);

    }
}
