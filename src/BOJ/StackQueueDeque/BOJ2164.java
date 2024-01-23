package BOJ.StackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        // 초기 카드 세팅
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        while (deque.size() > 1) {
            // 카드를 제일 위에서 버림
            deque.poll();

            // 남은 카드가 1장일 경우 반복 종료
            if (deque.size() == 1) break;

            // 짝수 번째 순서의 카드를 밑으로 옮김
            int evenCard = deque.poll();
            deque.offer(evenCard);
        }

        System.out.println(deque.peek());
    }
}
