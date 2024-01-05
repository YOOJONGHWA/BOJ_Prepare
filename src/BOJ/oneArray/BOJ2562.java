package BOJ.oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];  // 9개의 서로 다른 자연수라고 이미 정해져 있음
        int max = Integer.MIN_VALUE;
        int index = -1; // 배열은 0부터 시작이니깐
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if(max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
