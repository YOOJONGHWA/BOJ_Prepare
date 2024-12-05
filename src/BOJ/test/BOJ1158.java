package BOJ.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BOJ1158 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.addLast(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {

            for (int i = 1; i < K; i++) {
                queue.addLast(queue.pollFirst());
            }

            result.add(queue.pollFirst());
        }

        String output = result.stream()
                .map(String::valueOf) // 각 숫자를 문자열로 변환
                .collect(Collectors.joining(", ", "<", ">")); // 구분자와 포맷 설정
        System.out.println(output);

        sc.close();
    }
}
