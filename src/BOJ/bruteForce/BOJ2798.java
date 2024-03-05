package BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2798 {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int[] card = new int[N];
//        int findMax = 0;
//
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < card.length; i++) {
//            card[i] = Integer.parseInt(st.nextToken());
//        }
//
//       for(int i = 0; i < card.length-2; i++) {
//           for(int j = i + 1; j < card.length-1; j++) {
//               for (int k = j + 1; k < card.length; k++) {
//                   int sum = card[i] + card[j] + card[k];
//                   if (sum <= M && sum > findMax) {
//                       findMax = sum;
//                   }
//               }
//           }
//       }
//        System.out.println(findMax);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int findMax = 0;
        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = i + 1;  j < arr.length - 1; j++) {
                for(int k = j + 1; k < arr.length; k++) {
                    int sum = 0;
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && sum > findMax) {
                        findMax = sum;
                    }
                }
            }
        }
        System.out.println(findMax);

    }
}
