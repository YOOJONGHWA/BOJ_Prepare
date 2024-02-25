package programmers.lv1;


import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {

            if (!stack.isEmpty() || stack.peek() == num) {
                stack.pop();
            }
            else {
                stack.push(num);
            }

        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.pop();
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};

        같은숫자는싫어 sol = new 같은숫자는싫어();

        System.out.println(sol.solution(arr));
        System.out.println(sol.solution(arr2));

    }
}