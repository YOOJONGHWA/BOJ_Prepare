import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] atamp = new int[N + 2];
        for(int i = 0; i < stages.length; i++) {
            atamp[stages[i]] += 1;
        }
        
        // for(int num : atamp) {
        //     System.out.println(num);
        // }
        
        // 0 1 3 2 1 0 1
        
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;
        
        for(int i = 1; i <= N; i++) {
            if(atamp[i] == 0) {
                fails.put(i, 0.);
            }
            else {
                fails.put(i, atamp[i] / total);
                total -= atamp[i];
            }
        }
        
        return fails.entrySet().stream().sorted((o1,o2) -> Double.compare(o2.getValue(), o1.getValue()))
                  .mapToInt(HashMap.Entry::getKey).toArray();
    }
}