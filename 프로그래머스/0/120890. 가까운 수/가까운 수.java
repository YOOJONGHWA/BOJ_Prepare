import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
    int closestNumber = array[0];
        int minDifference = Math.abs(array[0] - n);

        for (int i = 1; i < array.length; i++) {
            int currentDifference = Math.abs(array[i] - n);
            
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                closestNumber = array[i];
            }
            else if (currentDifference == minDifference) {
                if (array[i] < closestNumber) {
                    closestNumber = array[i];
                }
            }
        }

        return closestNumber;
    }
}