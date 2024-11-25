package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();

        int[] arr = new int[n];
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            answer += arr[i];
        }
        System.out.println(answer);

    }

}
