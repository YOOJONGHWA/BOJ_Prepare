package BOJ.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine()," ");
        for (int j = 0; j < m; j++) {
            arr2[j] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> cardSet = new HashSet<>();
        for (int set : arr) {
            cardSet.add(set);
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < m; k++) {
            if (cardSet.contains(arr2[k])) {
                arr2[k] = 1;
            }
            else {
                arr2[k] = 0;
            }
            sb.append(arr2[k]).append("\n");
        }
        System.out.println(sb);
    }
}
