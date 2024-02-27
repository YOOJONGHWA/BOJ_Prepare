package programmers.lv1;

import java.util.*;
class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int length = arr.length;
        if(length <= 1) {
            answer = new int[]{-1};
            return answer;
        }
        int min = arr[0];
        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) {
            if(num != min) {
                list.add(num);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        제일작은수제거하기 sol = new 제일작은수제거하기();
        int[] arr = {4,3,2,1};
        int[] arr2 = {10};
        System.out.println(sol.solution(arr));
        System.out.println(sol.solution(arr2));

    }
}
