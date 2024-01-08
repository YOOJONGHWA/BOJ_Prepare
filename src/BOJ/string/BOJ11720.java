package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자의 개수 N을 입력받음
        int N = Integer.parseInt(br.readLine());

        // N개의 숫자를 공백 없이 입력받음
        String numbers = br.readLine();

        // 문자열을 순회하면서 각 문자를 정수로 변환하여 합을 계산
        int totalSum = 0;
        for (char digitChar : numbers.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            totalSum += digit;
        }

        // 결과 출력
        System.out.println(totalSum);

        br.close();
    }
}
