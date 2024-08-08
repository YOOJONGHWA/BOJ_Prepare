public class Solution {
    public int solution(int[][] dots) {
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;

        for (int[] dot : dots) {
            if (dot[0] < xMin) {
                xMin = dot[0];
            }
            if (dot[0] > xMax) {
                xMax = dot[0];
            }
            if (dot[1] < yMin) {
                yMin = dot[1];
            }
            if (dot[1] > yMax) {
                yMax = dot[1];
            }
        }

        int width = xMax - xMin;
        int height = yMax - yMin;

        return width * height;
    }
}
