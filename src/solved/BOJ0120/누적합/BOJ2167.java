package solved.BOJ0120.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2167 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] priFix = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                priFix[i][j] = arr[i][j] + priFix[i - 1][j] + priFix[i][j - 1] - priFix[i - 1][j - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = priFix[x2][y2] - priFix[x1 - 1][y2] - priFix[x2][y1 - 1] + priFix[x1 - 1 ][y1 -1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);

        for (int[] ints : priFix) {

            for (int j : ints) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < priFix.length; i++) {

            for (int j = 0; j < priFix[i].length; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
}
