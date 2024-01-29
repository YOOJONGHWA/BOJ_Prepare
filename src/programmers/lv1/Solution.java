package programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += x;
            answer[i] = result;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        Solution sol = new Solution();
        long[] result = sol.solution(x, n);
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
