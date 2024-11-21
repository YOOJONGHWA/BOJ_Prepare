package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

            if (arr[i] < X) {
                list.add(arr[i]);
            }

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
