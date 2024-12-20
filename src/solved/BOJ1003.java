package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(br.readLine());

            fibonacci(num);
            sb.append(dp[num][0]).append(" ").append(dp[num][1]).append("\n");

        }
        System.out.println(sb);

    }

    static Integer[] fibonacci(int n) {

        if (dp[n][0] == null && dp[n][1] == null) {

            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];

        }

        return dp[n];
    }

}
