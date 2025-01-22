package solved.BOJ0120.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ14719 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {

            int fill = Integer.parseInt(st.nextToken());
            for (int j = 0; j < fill; j++) {
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
