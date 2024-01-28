package programmers.lv2;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열을 공백으로 분리하여 숫자 문자열 배열로 변환
        String[] numbers = s.split(" ");

        // 문자열 배열을 정수 배열로 변환
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
            int min = intNumbers[0];
            int max = intNumbers[0];
            if (intNumbers[i] < min ) {
                min = intNumbers[i];
            } else if (intNumbers[i] > max) {
                max = intNumbers[i];
            }
            answer = min + " " + max;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1 2 3 4"));    // "1 4"
    }
}
