package programmers.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution2 {
    public int solution(int []A, int []B) {
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (i == j) {
                    answer += A[i] * B[j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] a = new int[Integer.parseInt(st.nextToken())];
        st = new StringTokenizer(br.readLine()," ");
        int[] b = new int[Integer.parseInt(st.nextToken())];

        Solution2 sol = new Solution2();
        System.out.println(sol.solution(a,b));

    }
}
