import java.util.*;

class Solution {
    public String solution(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> uniqueCharsList = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueCharsList.add(entry.getKey());
            }
        }

        Collections.sort(uniqueCharsList);

        StringBuilder answer = new StringBuilder();
        for (char c : uniqueCharsList) {
            answer.append(c);
        }

        return answer.toString();
    }
}