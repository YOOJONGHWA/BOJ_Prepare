import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] tokens = s.split(" ");
        
        Stack<Integer> stack = new Stack<>();
        
        for(String token : tokens) {
            
            if(token.equals("Z")) {
                
                if(!stack.isEmpty())
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(token));
            }
            
        }
        
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("1 2 Z 3"));
    }
}