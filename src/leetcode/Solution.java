package leetcode;

public class Solution {

    public static void main(String args[]) {
        final long startTime = System.currentTimeMillis();
        System.out.println(1232 * 1232);
        Solution s = new Solution();
        System.out.println("SQRT is : " + s.canMeasureWater(1, 2, 3));
        
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime) );
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if ((x == 0 && y == 0 && z == 0) || (x + y == z)) {
            return true;
        }
        if (x == 0 || y == 0 || z == 0) {
            return false;
        }
        if (x > y) {
            
            return fiveJugProblem(x, y, z);
        } else if (y > x) {
            return fiveJugProblem(y, x, z);
        }
        return false;
    }
    
    private static boolean fiveJugProblem(int x, int y, int z) {
        int fiveGallonJug = x - y;
        int threeGallonJug = fiveGallonJug;
        int result = x - ( y - threeGallonJug);
        if (result == z) {
            return true;
        }
        return false;
    }
}
