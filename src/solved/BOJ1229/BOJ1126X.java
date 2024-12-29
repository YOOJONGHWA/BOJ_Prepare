package solved.BOJ1229;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1126X {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = ch[j];
            }
        }

        int rowCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isNeed = true;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'X') {
                    isNeed = false;
                    break;
                }
            }
            if (isNeed) {
                rowCount++;
            }
        }

        int colCount = 0;
        for (int j = 0; j < m; j++) {
            boolean isNeed = true;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 'X') {
                    isNeed = false;
                    break;
                }
            }
            if (isNeed) {
                colCount++;
            }
        }
        System.out.println(Math.max(rowCount, colCount));
    }
}
