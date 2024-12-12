package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int w = Integer.parseInt(st.nextToken()); // 호텔의 방 수 (가로 길이)
            int n = Integer.parseInt(st.nextToken()); // n번째 손님

            // 층 번호 계산
            int floor = (n % h == 0) ? h : n % h;
            // 방 번호 계산
            int room = (n % h == 0) ? n / h : n / h + 1;

            System.out.println(floor * 100 + room);
        }
    }
}
