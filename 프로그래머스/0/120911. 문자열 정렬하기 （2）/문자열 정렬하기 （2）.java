import java.util.*;
class Solution {
    public String solution(String my_string) {

        String lowerCaseString = my_string.toLowerCase();
        
        char[] charArray = lowerCaseString.toCharArray();
        
        Arrays.sort(charArray);
        
        String answer = new String(charArray);
        
        return answer;
    }
}