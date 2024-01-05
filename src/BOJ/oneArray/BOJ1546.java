package BOJ.oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double total = 0;
        double M = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += (double) arr[i] / M * 100;

            // 최댓값 찾기
            if (M < arr[i]) {
                M = arr[i];
            }
        }

        // 새로운 평균 계산
        double newAverage = total / N;
        System.out.println(newAverage);
    }
}
