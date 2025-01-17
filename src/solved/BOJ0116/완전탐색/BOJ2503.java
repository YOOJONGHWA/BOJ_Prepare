package solved.BOJ0116.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2503 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] info = new String[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            info[i][0] = st.nextToken(); // 번호 ex) 123
            info[i][1] = st.nextToken(); // 스트라이크
            info[i][2] = st.nextToken(); // 볼
        }

        int answer = 0;
        for (int a = 1; a < 10; a++) {

            for (int b = 1; b < 10; b++) {

                for (int c = 1; c < 10; c++) {

                    if (a == b || b == c || c == a) continue;

                    int count = 0;

                    for (String[] str : info) {

                        String num = str[0];
                        int strike = Integer.parseInt(str[1]);
                        int ball = Integer.parseInt(str[2]);

                        int strikeCount = 0;
                        int ballCount = 0;

                        // 스트라이크 계산
                        if (a == (num.charAt(0) - '0')) strikeCount++;
                        if (b == (num.charAt(1) - '0')) strikeCount++;
                        if (c == (num.charAt(2) - '0')) strikeCount++;

                        // 볼 계산
                        if (a == (num.charAt(1) - '0') || a == (num.charAt(2) - '0')) ballCount++;
                        if (b == (num.charAt(0) - '0') || b == (num.charAt(2) - '0')) ballCount++;
                        if (c == (num.charAt(0) - '0') || c == (num.charAt(1) - '0')) ballCount++;

                        if (strike != strikeCount || ball != ballCount) break;

                        count++;
                    }
                    if (count == n) answer++;
                }

            }

        }
        System.out.println(answer);
    }
}
