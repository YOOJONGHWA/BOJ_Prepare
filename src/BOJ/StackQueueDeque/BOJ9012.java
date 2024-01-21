package BOJ.StackQueueDeque;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            bw.write(findSolution(st.nextToken()) + "\n");

        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static String findSolution(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}