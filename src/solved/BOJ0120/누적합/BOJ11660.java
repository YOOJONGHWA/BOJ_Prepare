package solved.BOJ0120.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11660 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int board = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[board + 1][board + 1];

        for (int i = 1; i <= board; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= board; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] prefix = new int[board + 1][board + 1];
        for (int i = 1; i <= board; i++) {
            for (int j = 1; j <= board; j++) {
                prefix[i][j] = arr[i][j] + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 구간 합 계산
            int sum = prefix[x2][y2] - prefix[x1 - 1][y2] - prefix[x2][y1 - 1] + prefix[x1 - 1][y1 - 1];
            result.append(sum).append("\n");

            /*
            *
            * 0 0 0 0 0
            * 0 (1) 3 6 (10)
            * 0 (3 8 15 24)
            * 0 (6) 15 27 (42)
            * 0 10 24 42 64
            *
            * */
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=================");
        for (int i = 0; i < prefix.length; i++) {

            for (int j = 0; j < prefix.length; j++) {
                System.out.print(prefix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
