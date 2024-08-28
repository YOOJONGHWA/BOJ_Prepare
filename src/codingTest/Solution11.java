package codingTest;

import java.util.*;

class Solution11 {
    public int solution(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {

            if(!stack.isEmpty() && stack.peek() == c[i]) {
                stack.pop();
            }
            else {
                stack.push(c[i]);
            }

        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {

        System.out.println(new Solution11().solution("baabaa"));

    }

}