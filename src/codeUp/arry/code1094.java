package codeUp.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int call = Integer.parseInt(br.readLine());
        int[] arr = new int[call];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < call; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
