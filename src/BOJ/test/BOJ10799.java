package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ10799 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 문자열을 char 배열로 변환
        char[] chars = str.toCharArray();

        // 스택을 사용하여 '('와 ')'를 처리
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(') {
                // '('가 나오면 스택에 추가 (쇠막대기 시작)
                stack.push(chars[i]);
            } else {
                // ')'가 나오면 스택에서 하나를 꺼내고
                stack.pop();

                // 만약 직전이 '('라면, 이는 레이저이므로 잘린 쇠막대기 수를 추가
                if (chars[i - 1] == '(') {
                    result += stack.size(); // 레이저에 의해 잘린 쇠막대기 개수는 스택에 남아 있는 괄호의 개수
                } else {
                    // 직전이 ')'이면 쇠막대기가 끝났으므로 1개 추가
                    result += 1;
                }
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
