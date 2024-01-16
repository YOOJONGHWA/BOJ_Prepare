package BOJ.sorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2750 {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine()," ");
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        // 버블 정렬 방식
//        for(int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
////        Arrays.sort(arr);
//
//        for (int result : arr) {
//            System.out.println(result);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 1000; i++) {
            while (arr[i] > 0) {
                bw.write(i + "\n");
                arr[i]--;
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
