import java.util.*;
class Solution {
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
}