package programmers.lv1;

import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,1};
        int[] arr2 = {4,4,4,3,3};

        같은숫자는싫어 sol = new 같은숫자는싫어();

        System.out.println(Arrays.toString(sol.solution(arr)));
        System.out.println(Arrays.toString(sol.solution(arr2)));

    }
}