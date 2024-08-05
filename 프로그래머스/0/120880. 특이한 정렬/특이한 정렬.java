import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static int[] solution(int[] numlist, int n) {

        Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int distanceA = Math.abs(a - n);
                int distanceB = Math.abs(b - n);
                
                if (distanceA != distanceB) {
                    return distanceA - distanceB;
                } else {
                    return b - a;
                }
            }
        };

        Integer[] numArray = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(numArray, customComparator);

        return Arrays.stream(numArray).mapToInt(Integer::intValue).toArray();
    }

}
