package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 수의 개수
        int m = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수

        int[] dp = new int[n + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + Integer.parseInt(st.nextToken());;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            sb.append(dp[last] - dp[first - 1]).append("\n");
        }

        System.out.print(sb);
    }
}
