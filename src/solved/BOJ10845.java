package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    deque.addLast(x); // 큐의 뒤에 삽입
                    break;

                case "pop":
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollFirst()).append("\n"); // 큐의 앞에서 제거
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    sb.append(deque.isEmpty() ? "1" : "0").append("\n");
                    break;

                case "front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekFirst()).append("\n"); // 큐의 앞 요소 확인
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;

                case "back":
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekLast()).append("\n"); // 큐의 뒤 요소 확인
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}
