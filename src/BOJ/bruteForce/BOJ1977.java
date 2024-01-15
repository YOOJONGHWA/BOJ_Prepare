package BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1977 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n-m];
        int result = 0, temp;

        for (int i = m; i <= arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] / j == 0) {
                    result += arr[i];
                    temp = arr[i];
                    if (temp < arr[i]) {
                        temp = arr[i];
                        System.out.println(result + "\n" + temp);
                    }
                }
            }
        }
    }
}
