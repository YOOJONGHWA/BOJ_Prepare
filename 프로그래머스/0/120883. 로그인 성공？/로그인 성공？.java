import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
            
        HashMap<String, String> map = new HashMap<>();
        for(String[] entry : db) {
            String id = entry[0];
            String pw = entry[1];
            map.put(id,pw);
        }
        
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        
        if(map.containsKey(inputId)) {
            if(map.get(inputId).equals(inputPw)) {
                answer = "login";
            }
            else {
                answer = "wrong pw";
            }
        }
        else {
            answer = "fail";
        }
        
        return answer;
    }
}