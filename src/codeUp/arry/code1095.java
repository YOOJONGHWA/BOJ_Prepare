package codeUp.arry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code1095 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int call = Integer.parseInt(br.readLine());
        int[] arr = new int[call];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < call; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNum > arr[i]) {
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
    }

}
