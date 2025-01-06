package solved.BOJ0106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10817 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(arr[1]);

    }

//    static int[] arr = new int[3];
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        System.out.println(findNumber(arr));
//    }
//
//    private static int findNumber(int[] arr) {
//
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            for (int j = 0; j < arr.length -1 - i; j++) {
//
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//
//        }
//
//        return arr[1];
//    }

}
