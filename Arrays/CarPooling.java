package Arrays;

public class CarPooling {
    public static boolean carPooling(int[][] trips, int capacity) {
        int[] changes = new int[1001];
        
        for(int[] trip:  trips) {
            changes[trip[1]] += trip[0];
            changes[trip[2]] -= trip[0];
        }

        int passengers = 0;
        for(int i=0; i<1001; i++) {
            passengers += changes[i];

            if(passengers > capacity) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] trips = {{2,1,5},{3,3,7}};
        System.out.println(carPooling(trips, 4));
    }
}
