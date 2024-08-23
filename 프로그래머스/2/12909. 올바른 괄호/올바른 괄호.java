import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '(') { 
                stack.push(ch[i]);
            } else if (ch[i] == ')') { 
                if (stack.isEmpty()) { 
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty(); 
    }
}
