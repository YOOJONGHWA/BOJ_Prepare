package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {

    static Long[] dp = new Long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        dp[4] = 2L;
        dp[5] = 2L;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            padoBan(n);
            System.out.println(dp[n]);
        }

    }

    private static Long padoBan(int index) {

        if (dp[index] == null) {
            dp[index] = padoBan(index -1) + padoBan(index -5);
        }

        return dp[index];
    }

}
