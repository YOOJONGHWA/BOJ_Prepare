package codingTest;

import java.util.Arrays;
import java.util.HashMap;

public class pg_06 {
    
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;
        
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            }
            else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
//        return fails.entrySet().stream().sorted(((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())))
//                .mapToInt(HashMap.Entry::getKey).toArray();
        return fails.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey).toArray();
    }

    public static void main(String[] args) {
         pg_06 pg_06 = new pg_06();
         System.out.println(Arrays.toString(pg_06.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }
    
}
