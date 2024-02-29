package programmers.lv1;

import java.util.*;
class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < answer.length; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                answer[i] = i - map.get(c);
            }
            else {
                answer[i] = -1;
            }
            map.put(c,i);
        }
        return answer;
    }
    public static void main(String[] args) {
        가장가까운같은글자 sol = new 가장가까운같은글자();
        System.out.println(sol.solution("banana"));
    }
}
