package solved.BOJ0115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 맵 크기

        // 동, 서, 북, 남 방향
        int[] dx = {1, -1, 0, 0}; // 오른쪽, 왼쪽, 위, 아래
        int[] dy = {0, 0, 1, -1}; // 오른쪽, 왼쪽, 위, 아래

        String[] name = {"R", "L", "U", "D"};  // 이동 명령

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 명령 입력
        int x = 1, y = 1;  // 시작 위치

        while (st.hasMoreTokens()) {
            String command = st.nextToken();  // 하나씩 명령 확인

            // 이동 명령에 맞는 dx, dy 값 찾기
            for (int i = 0; i < dx.length; i++) {
                if (command.equals(name[i])) {
                    int nx = x + dx[i];  // 새로운 x 좌표
                    int ny = y + dy[i];  // 새로운 y 좌표

                    // 범위 체크: 좌표가 1과 n 사이에 있는지 확인
                    if (nx >= 1 && ny >= 1 && nx <= n && ny <= n) {
                        x = nx;  // 범위 내일 경우 이동
                        y = ny;
                    }
                    break;  // 이동이 완료되었으면 다음 명령으로
                }
            }
        }

        // 결과 출력
        System.out.println(x + " " + y);
    }
}
