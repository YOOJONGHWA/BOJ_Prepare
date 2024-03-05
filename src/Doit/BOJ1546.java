package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxScores = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            maxScores = Math.max(maxScores,scores[i]);
        }
        double sum = 0;
        for (int score : scores) {
            sum += (double) score / maxScores * 100;
        }
        System.out.println(sum / N);
    }
}
