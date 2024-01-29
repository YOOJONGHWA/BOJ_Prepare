package programmers.lv1;

import java.util.*;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n);
        int len = num.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            answer += arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {

        int N = 123;
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(N));

    }
}