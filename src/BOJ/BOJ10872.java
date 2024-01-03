package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int minValue = Integer.MAX_VALUE; // 초기값을 최대값으로 설정
        int maxValue = Integer.MIN_VALUE; // 초기값을 최소값으로 설정

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        System.out.println(minValue + " " + maxValue);
    }
}
