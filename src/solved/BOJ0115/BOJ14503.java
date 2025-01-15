package solved.BOJ0115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14503 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());  // 세로 크기
        int m = Integer.parseInt(st.nextToken());  // 가로 크기

        st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());  // 로봇의 시작 X 좌표
        int y = Integer.parseInt(st.nextToken());  // 로봇의 시작 Y 좌표
        int d = Integer.parseInt(st.nextToken());  // 로봇의 시작 방향 (0: 북, 1: 동, 2: 남, 3: 서)

        int[] dx = {-1, 0, 1, 0};  // 북, 동, 남, 서
        int[] dy = {0, 1, 0, -1};

        int[][] space = new int[n][m];  // 방의 상태
        boolean[][] visited = new boolean[n][m];  // 청소한 칸 체크

        // 방의 상태 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                space[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 현재 위치와 방향
        int currentX = x;
        int currentY = y;
        int currentDirection = d;

        // 청소 횟수
        int cleanedCount = 0;

        while (true) {
            // 1. 현재 칸이 청소되지 않은 빈 칸이라면 청소
            if (space[currentX][currentY] == 0 && !visited[currentX][currentY]) {
                visited[currentX][currentY] = true;  // 방문 처리
                cleanedCount++;  // 청소한 칸 수 증가
            }

            // 2. 주변 4칸 탐색
            boolean isCleanedAll = true;  // 주변에 청소할 곳이 있는지 확인
            for (int i = 0; i < 4; i++) {
                // 현재 방향을 기준으로 왼쪽으로 90도 회전
                currentDirection = (currentDirection + 3) % 4;  // 왼쪽 회전

                int nx = currentX + dx[currentDirection];
                int ny = currentY + dy[currentDirection];

                // 3. 빈 칸이 있으면 그 방향으로 이동하여 청소
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && space[nx][ny] == 0 && !visited[nx][ny]) {
                    currentX = nx;
                    currentY = ny;
                    isCleanedAll = false;
                    break;  // 이동 후 청소했으므로, 반복문 종료
                }
            }

            // 3. 주변 4칸이 모두 청소되었거나 벽으로 막힌 경우
            if (isCleanedAll) {
                // 후진
                int backDirection = (currentDirection + 2) % 4;  // 후진 방향
                int backX = currentX + dx[backDirection];
                int backY = currentY + dy[backDirection];

                // 후진할 수 있으면 후진
                if (backX >= 0 && backY >= 0 && backX < n && backY < m && space[backX][backY] != 1) {
                    currentX = backX;
                    currentY = backY;
                } else {
                    // 후진할 수 없으면 종료
                    break;
                }
            }
        }

        System.out.println(cleanedCount);
    }
}
