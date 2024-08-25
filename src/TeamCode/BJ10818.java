package TeamCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열의 크기 입력
        int n = Integer.parseInt(br.readLine());

        // 최대값과 최소값 초기화
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 배열 요소를 입력받고 최대값, 최소값 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // 결과 출력
        System.out.println(min + " " + max);
    }
}
