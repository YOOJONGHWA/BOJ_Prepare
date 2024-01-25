package BOJ.StackQueueDeque;

import java.io.*;
import java.util.*;

public class BOJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 요세푸스 순열을 저장할 리스트
        List<Integer> josephusList = new ArrayList<>();

        // 덱을 이용하여 요세푸스 순열 구하기
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        while (!deque.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                // K-1번째까지의 원소는 덱의 뒤로 이동
                int front = deque.poll();
                deque.offer(front);
            }

            // K번째 원소를 요세푸스 순열 리스트에 추가
            josephusList.add(deque.poll());
        }

        // 출력
        bw.write("<" + josephusList.get(0));
        for (int i = 1; i < josephusList.size(); i++) {
            bw.write(", " + josephusList.get(i));
        }
        bw.write(">");
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
