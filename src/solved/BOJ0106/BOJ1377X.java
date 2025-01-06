package solved.BOJ0106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1377X {

// 시간 초가

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[n + 1];
//
//        for (int i = 1; i <= n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        for (int i = 1; i <= n; i++) {
//            boolean changed = false;
//            for (int j = 1; j <= n - i; j++) {
//
//                if (arr[j] > arr[j + 1]) {
//                    changed = true;
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//            if (!changed) {
//                System.out.println(i);
//                break;
//            }
//
//        }
//
//    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2]; // 2차원 배열 사용: [값, 원래 인덱스]

        // 값과 인덱스 저장
        for (int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(br.readLine()); // 값
            arr[i][1] = i;                              // 원래 인덱스
        }

        // 값 기준으로 정렬
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int maxMove = 0;

        // 정렬 후 이동 거리 계산
        for (int i = 0; i < n; i++) {
            maxMove = Math.max(maxMove, arr[i][1] - i); // 원래 인덱스 - 현재 인덱스
        }

        // 최대 이동 거리 + 1 출력
        System.out.println(maxMove + 1);
    }

}
