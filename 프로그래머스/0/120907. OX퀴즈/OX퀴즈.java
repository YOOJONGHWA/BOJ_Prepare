import java.util.Stack;

class Solution {
    public String[] solution(String[] quiz) {
        String[] results = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" ");
            Stack<Integer> stack = new Stack<>();
            
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);
            
            stack.push(X);
            
            if (operator.equals("+")) {
                stack.push(Y);
            } else if (operator.equals("-")) {
                stack.push(-Y);
            }
            
            int result = 0;
            while (!stack.isEmpty()) {
                result += stack.pop();
            }
            
            if (result == Z) {
                results[i] = "O";
            } else {
                results[i] = "X";
            }
        }
        
        return results;
    }
}
