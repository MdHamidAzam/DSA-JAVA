package Stack;

import java.util.*;

public class MaxAreaHistogram {
    public static int maxAreaInHistogram(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        Stack<Integer> s = new Stack<>();
        
        // Next Smaller Right
        for(int i=n-1; i>=0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) s.pop();
            if(s.isEmpty()) nsr[i] = n;
            else nsr[i] = s.peek();
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for(int i=0; i<n; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) s.pop();
            if(s.isEmpty()) nsl[i] = -1;
            else nsl[i] = s.peek();
            s.push(i);
        }
        // Current Area: width = j-i-1 || nsr[i] - nsl[i] - 1;
        for(int i=0; i<n; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(maxAreaInHistogram(heights));
    }
}
