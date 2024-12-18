package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;

public class BOJ4949 {

    public static void main(String[] args) throws IOException {

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            String str = br.readLine();

            if (str.equals(".")) break;

            for (char ch : str.toCharArray()) {

                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                }

                if (ch == ')' || ch == ']' || ch == '}') {
                    if (!stack.isEmpty() && stack.peek() == map.get(ch)) {
                        stack.pop();
                    }
                }
            }
            System.out.println(stack.isEmpty() ? "yes" : "no");
        }
    }
}
