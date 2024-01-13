package BOJ.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;  // 입력이 0 0인 경우 종료
            }

            String result = testCase(A, B);
            System.out.println(result);
        }
    }

    private static String testCase(int a, int b) {
        if (b % a == 0) {
            return "factor";
        } else if (a % b == 0) {
            return "multiple";
        } else {
            return "neither";
        }
    }
}
