import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        
        int[] arr = Arrays.copyOf(array, array.length);
        Arrays.sort(arr);
        
        int max = arr[arr.length - 1];
        
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                index = i;
                break;
            }
        }
        
        int[] answer = new int[2];
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
}
