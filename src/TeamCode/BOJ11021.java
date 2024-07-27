package TeamCode;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11021 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        for (int i = 0; i < arr.length; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = a + b;
            int count = i + 1;

            bw.write("Case #" + count  + ": " + a + " + " + b + " = " + arr[i] + "\n");

        }
        bw.flush();
        bw.close();

    }

}
