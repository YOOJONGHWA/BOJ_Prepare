package solved.BOJ0120.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        int targetX = 0;
        int maxY = 0;

        // 기둥의 좌표와 높이 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            // 최대 높이와 그에 해당하는 x좌표 찾기
            if (maxY < arr[i][1]) {
                maxY = arr[i][1];
                targetX = arr[i][0];
            }
        }

        // targetX는 final로 선언되어야 합니다.
        final int finalTargetX = targetX;

        // 기둥을 정렬
        Arrays.sort(arr, (x, y) -> {
            // targetX 기준으로 왼쪽 기둥은 먼저 오도록 정렬
            if (x[0] < finalTargetX && y[0] >= finalTargetX) {
                return -1;
            } else if (x[0] >= finalTargetX && y[0] < finalTargetX) {
                return 1;
            } else {
                return Integer.compare(x[0], y[0]) != 0 ? Integer.compare(x[0], y[0]) : Integer.compare(x[1], y[1]);
            }
        });

        // 창고의 최대 x 좌표와 최소 x 좌표 구하기
        int maxX = 0;
        for (int i = 0; i < n; i++) {
            maxX = Math.max(maxX, arr[i][0]);
        }

        // 왼쪽에서 오른쪽으로 최대 높이 계산
        int[] leftMax = new int[maxX + 1];
        for (int i = 0; i < n; i++) {
            leftMax[arr[i][0]] = arr[i][1];
        }
        for (int i = 1; i <= maxX; i++) {
            leftMax[i] = Math.max(leftMax[i], leftMax[i - 1]);
        }

        // 오른쪽에서 왼쪽으로 최대 높이 계산
        int[] rightMax = new int[maxX + 1];
        for (int i = 0; i < n; i++) {
            rightMax[arr[i][0]] = arr[i][1];
        }
        for (int i = maxX - 1; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i], rightMax[i + 1]);
        }

        // 면적 계산
        int area = 0;
        for (int i = 0; i <= maxX; i++) {
            area += Math.min(leftMax[i], rightMax[i]);
        }

        System.out.println(area);
    }
}
