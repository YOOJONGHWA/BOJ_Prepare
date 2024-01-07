package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9086 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수 T를 입력받습니다.
        int T = Integer.parseInt(reader.readLine());

        for (int t = 0; t < T; t++) {
            // 각 테스트 케이스에 대해 문자열을 입력받습니다.
            String input = reader.readLine();

            // 문자열의 첫 글자와 마지막 글자를 출력합니다.
            System.out.println(input.charAt(0) + "" + input.charAt(input.length() - 1));
        }

        reader.close();
    }
}
