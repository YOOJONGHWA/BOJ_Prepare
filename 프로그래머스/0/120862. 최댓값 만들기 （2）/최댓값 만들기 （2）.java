import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[numbers.length];
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] * numbers[j];
                if(sum > max) {
                    max = sum;
                }
            }
            
        }

        answer = max;
        return answer;
    }
}