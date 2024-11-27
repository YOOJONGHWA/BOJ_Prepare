package BOJ.test;

import java.util.Stack;

// 10진수를 2진수로 바꾸기
public class Solution {

    public static String Solution(int decimal) {

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int num = decimal;
        while(num > 0) {
            stack.push(num % 2);
            num = num / 2;
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(Solution.Solution(10));
    }

}
