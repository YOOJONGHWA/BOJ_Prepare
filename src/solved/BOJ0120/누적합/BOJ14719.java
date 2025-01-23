package solved.BOJ0120.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// water = min(왼쪽 최대 높이, 오른쪽 최대 높이) - 현재 칸의 높이
public class BOJ14719 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] height = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int[] leftHeight = new int[m];
        leftHeight[0] = height[0];
        for (int i = 1; i < m; i++) {
            leftHeight[i] = Math.max(leftHeight[i - 1], height[i]);
        }


        int[] rightHeight = new int[m];
        rightHeight[m - 1] = height[m - 1];
        for (int i = m - 2; i >= 0; i--) {
            rightHeight[i] = Math.max(rightHeight[i + 1], height[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < m; i++) {

            int water = Math.min(leftHeight[i], rightHeight[i]) - height[i];
            if (water > 0) {
                totalWater += water;
            }
        }
        System.out.println(totalWater);
    }
}
