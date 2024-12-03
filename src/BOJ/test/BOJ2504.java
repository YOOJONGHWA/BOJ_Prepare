package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;

public class BOJ2504 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');

        HashMap<Character, Integer> values = new HashMap<>();
        values.put(')', 2);
        values.put(']', 3);

        ArrayDeque<Character> stack = new ArrayDeque<>();
        int temp = 0; // 현재 계산 중인 값
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!map.containsKey(c)) { // 여는 괄호
                stack.push(c);
            } else { // 닫는 괄호
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    System.out.println(0);
                    return; // 올바르지 않은 괄호열
                }

                stack.pop(); // 여는 괄호 제거

                // 괄호 내부 값 계산
                if (temp == 0) {
                    temp = values.get(c); // 비어있다면 기본값 설정
                } else {
                    temp *= values.get(c); // 괄호에 곱셈 연산 적용
                }

                // 상위 괄호에 값을 더하기 위해 초기화
                if (stack.isEmpty()) {
                    answer += temp;
                    temp = 0;
                }
            }
        }

        // 스택이 비어 있지 않으면 올바르지 않은 괄호열
        System.out.println(stack.isEmpty() ? answer : 0);
    }
}
