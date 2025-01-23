package solved.BOJ0120.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ14719 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] heights = new int[m];
        for (int i = 0; i < m; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int[][] arr = new int[n][m];
        for (int j = 0; j < m; j++) {
            int fillHeight = heights[j];
            for (int i = n - 1; i >= n - fillHeight; i--) {
                arr[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
