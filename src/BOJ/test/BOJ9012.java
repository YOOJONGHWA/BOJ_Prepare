package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String str = br.readLine();

            sb.append(checkPattern(str) ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);

    }

    private static boolean checkPattern(String str) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(') {
                stack.push(chars[i]);
            }
            else {

                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();

            }

        }
        return stack.isEmpty();
    }
}
