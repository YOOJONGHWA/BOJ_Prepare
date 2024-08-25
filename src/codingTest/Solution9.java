package codingTest;

import java.util.ArrayDeque;

public class Solution9 {

    public static String solution1(int n) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (n > 0) {
            int change = n % 2;
            stack.push(change);
            n /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Solution9 sol = new Solution9();
        System.out.println(sol.solution1(10));

    }

}
