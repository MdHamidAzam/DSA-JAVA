package Arrays;

public class ContainerWithMostwater {
    public static void ContainerWithMostwater(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int lp = 0; // left pointer
        int rp = n - 1; // right poointer

        while (lp < rp) {
            int width = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int currWater = width * ht; // area
            maxWater = Math.max(currWater, maxWater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        System.out.println(maxWater);
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ContainerWithMostwater(height);
    }
}
