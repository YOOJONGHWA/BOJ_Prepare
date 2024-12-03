package BOJ.test;

import java.util.ArrayDeque;

// 요세푸스 문제
public class Solution2 {

    public static int solution(int n, int k) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {

            for (int i = 0; i < k - 1; i++) {
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst();

        }

        return deque.pollFirst();
    }

    public static void main(String[] args) {

        Solution2 s = new Solution2();
        int n = 5;
        int k = 2;
        System.out.println(Solution2.solution(5, 2));

    }

}
