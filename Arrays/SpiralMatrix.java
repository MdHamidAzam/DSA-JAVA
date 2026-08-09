package Arrays;

public class SpiralMatrix {
    public static void SpiralMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int minr = 0;
        int maxr = m - 1;
        int minc = 0;
        int maxc = n - 1;

        while (minr <= maxr && minc <= maxc) {
            // left to right
            for (int i = minc; i <= maxc; i++) {
                System.out.print(matrix[minr][i] + " ");
            }
            minr++;

            // top to bottom
            if (minr > maxr || minc > maxc)
                break;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(matrix[i][maxc] + " ");
            }
            maxc--;

            // right to left
            if (minr > maxr || minc > maxc)
                break;
            for (int i = maxc; i >= minc; i--) {
                System.out.print(matrix[maxr][i] + " ");
            }
            maxr--;

            // bottom to top
            if (minr > maxr || minc > maxc)
                break;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(matrix[i][minc] + " ");
            }
            minc++;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        SpiralMatrix(matrix);
    }
}
