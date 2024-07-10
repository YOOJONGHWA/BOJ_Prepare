package codeUp.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int[] arr = new int[23];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < number; i++) {
            int count = Integer.parseInt(st.nextToken());
            arr[count - 1]++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
