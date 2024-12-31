package solved.BOJ1231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1931X {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] timeTable = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            timeTable[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            timeTable[i][1] = Integer.parseInt(st.nextToken()); // 완료 시간
        }

        Arrays.sort(timeTable, (a, b) -> {

            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        int count = 0;
        int endTime = 0;
        for (int[] ans : timeTable) {

            if (ans[0] >= endTime) {
                count++;
                endTime = ans[1];
            }

        }
        System.out.println(count);
    }

}
