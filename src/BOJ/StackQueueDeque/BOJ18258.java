package BOJ.StackQueueDeque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ18258 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String commend = st.nextToken();

            switch (commend) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    deque.offer(num);
                    break;
                case "pop" :
                    Integer polledValue = deque.poll();
                    if (polledValue == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(polledValue).append("\n");
                    }
                    break;

                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    }
                    else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front" :
                    if (deque.peek() ==  null) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(deque.peek()).append("\n");
                    }
                    break;
                case "back" :
                    if (deque.peekLast() == null) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(deque.peekLast()).append("\n");
                    }
            }
        }
        System.out.println(sb);
    }
}

