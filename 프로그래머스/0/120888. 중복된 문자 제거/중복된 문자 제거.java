import java.util.*;

class Solution {
    public String solution(String my_string) {
        Stack<Character> stack = new Stack<>();
        Set<Character> set = new LinkedHashSet<>();
        
        for (char c : my_string.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        return result.reverse().toString(); 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("people")); 
        System.out.println(sol.solution("We are the world")); 
    }
}
