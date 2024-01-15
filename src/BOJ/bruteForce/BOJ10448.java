package BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10448 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());
        int[] testNum = new int[test];

        for (int j = 0; j < testNum.length; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            testNum[j] = Integer.parseInt(st.nextToken());
            int num = testNum[j];

            int[] role = new int[num + 1];
            // 이전까지의 누적 값을 배열에 저장
            for (int i = 1; i <= num; i++) {
                role[i] = role[i - 1] + i;
            }

            // 세 수의 합이 num이 되는지 확인
            boolean found = false;
            for (int i = 1; i <= num; i++) {
                for (int k = 1; k <= num; k++) {
                    for (int l = 1; l <= num; l++) {
                        if (role[i] + role[k] + role[l] == num) {
                            found = true;
                            break;
                        }
                    }
                }
            }

            System.out.println(found ? 1 : 0);
        }
    }
}
