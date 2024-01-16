package BOJ.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] countSort = new int[10001];   // 10000개의 수 배열

        for (int i = 0; i < n; i++) {
            countSort[Integer.parseInt(br.readLine())]++;   // countSort배열에 값 대입
        }

        for (int i = 1; i <= 10000; i++) {
            while (countSort[i] > 0) {
                bw.write(i + "\n");
                countSort[i]--;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}

