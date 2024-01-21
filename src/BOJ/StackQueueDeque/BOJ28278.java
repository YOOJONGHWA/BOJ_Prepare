package BOJ.StackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ28278 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int commend = Integer.parseInt(st.nextToken());

            switch (commend) {
                case 1 :
                    int value = Integer.parseInt(st.nextToken());
                    stack.push(value);
                    break;
                case 2 :
                    if (!stack.isEmpty()) {
                        bw.write(stack.pop() + "\n");
                    }
                    else {
                        bw.write("-1" + "\n");
                    }
                    break;
                case 3 :
                    bw.write(stack.size() + "\n");
                    break;
                case 4 :
                    if (stack.isEmpty()) {
                        bw.write("1" + "\n");
                    }
                    else {
                        bw.write("0" + "\n");
                    }
                    break;
                case 5 :
                    if (!stack.isEmpty()) {
                        bw.write(stack.peek() + "\n");
                    }
                    else {
                        bw.write("-1" + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
