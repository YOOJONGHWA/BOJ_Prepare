package BOJ.setAndMap;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ10815 {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int m = Integer.parseInt(br.readLine());
//        int[] arr2 = new int[m];
//
//        st = new StringTokenizer(br.readLine()," ");
//        for (int j = 0; j < m; j++) {
//            arr2[j] = Integer.parseInt(st.nextToken());
//        }
//
//        HashSet<Integer> cardSet = new HashSet<>();
//        for (int set : arr) {
//            cardSet.add(set);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int k = 0; k < m; k++) {
//            if (cardSet.contains(arr2[k])) {
//                arr2[k] = 1;
//            }
//            else {
//                arr2[k] = 0;
//            }
//            sb.append(arr2[k]).append("\n");
//        }
//        System.out.println(sb);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < m; i++) {
            int card = Integer.parseInt(st.nextToken());
            if (set.contains(card)) {
                bw.write(1 + "\n");
            }
            else {
                bw.write(0 + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
