class Solution {
   public int solution(int[][] dots) {

        return (parallel(dots[0], dots[1], dots[2], dots[3]) ||
                parallel(dots[0], dots[1], dots[2], dots[3]) ||
                parallel(dots[0], dots[2], dots[1], dots[3]) ||
                parallel(dots[0], dots[2], dots[1], dots[3]) ||
                parallel(dots[0], dots[3], dots[1], dots[2]) ||
                parallel(dots[0], dots[3], dots[1], dots[2])) ? 1 : 0;
    }

    private boolean parallel(int[] p1, int[] p2, int[] p3, int[] p4) {

        int dx1 = p2[0] - p1[0];
        int dy1 = p2[1] - p1[1];
        int dx2 = p4[0] - p3[0];
        int dy2 = p4[1] - p3[1];
        
        return dy1 * dx2 == dy2 * dx1;
    }
}


/*

        y2 - y1         y4 - y3     
        -------   =     -------                 
        x2 - x1         x4 - x3     
        
        (y2−y1)×(x4−x3)=(y4−y3)×(x2−x1)
*/