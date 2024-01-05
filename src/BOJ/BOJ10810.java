package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] backet = new int[N];

        for(int e = 0; e< M; e++) {
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            putInBall(backet, i - 1 , j - 1 , k);
        }
        for (int i = 0; i < backet.length; i++) {
            sb.append(backet[i]).append("\n");
        }
        System.out.println(sb);

    }
    private static void putInBall(int[] arr, int start, int end, int number ) {
//        while (start <= end) {
//            arr[start] = number;
//            arr[end] = number;
//            start++;
//            end--;
//        }
        Arrays.fill(arr,start, end + 1, number);
    }
}
