package Arrays;

public class ToeplitzMatrix {
    public static boolean isToeplitz(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;

        for(int i=0; i<m-1; i++) {
            for(int j=0; j<n-1; j++) {
                if(nums[i][j] == nums[i][j] && nums[i][j] == nums[i+1][j+1]) 
                    continue;
                    else return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int nums[][] = {
                { 1, 2, 3, 4 },
                { 5, 1, 2, 3 },
                { 9, 5, 1, 2 }
        };
        System.out.println(isToeplitz(nums));
    }
}
