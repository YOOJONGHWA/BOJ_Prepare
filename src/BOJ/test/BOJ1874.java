package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        boolean isPossible = true;
        for (int i = 0; i < N; i++) {

            int target = arr[i];

            while(num <= target) {
                stack.push(num++);
                sb.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            }
            else {
                isPossible = false;
                break;
            }
        }
        if (isPossible) System.out.println(sb);
        else System.out.println("NO");
    }
}
