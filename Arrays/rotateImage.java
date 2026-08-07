package Arrays;

public class RotateImage {
    public static void rotateImage(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;

        // Transpose the matrix
        for(int i=0; i<m; i++) {
            for(int j=0; j<i; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i=0; i<m; i++) {
            int a = 0; int b = m-1;
            while(a < b) {
                int temp = nums[i][a];
                nums[i][a] = nums[i][b];
                nums[i][b] = temp;
                a++;
                b--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        rotateImage(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
