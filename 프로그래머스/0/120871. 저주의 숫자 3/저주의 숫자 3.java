import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; list.size() < n; i++) {
            if (i % 3 == 0 || Integer.toString(i).contains("3")) {
                continue;
            }
            list.add(i);
        }
        
        return list.get(n - 1);
    }

}
