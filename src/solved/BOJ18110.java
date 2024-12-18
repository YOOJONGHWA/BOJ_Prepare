package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ18110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 예외 처리: n이 0일 경우 0 출력
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 상위/하위 15% 제외한 범위 계산
        int trim = (int) Math.round(n * 0.15); // 반올림
        int total = 0;

        for (int i = trim; i < n - trim; i++) {
            total += arr[i];
        }

        // 평균 계산 및 반올림
        int validCount = n - 2 * trim; // 유효한 숫자 개수
        int result = (int) Math.round((double) total / validCount);

        System.out.println(result);
    }
}
