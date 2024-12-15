package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2775 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] arr = new int[15][15];

        for (int i = 1; i < arr.length; i++) {
            arr[0][i] = i;
        }

        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr[0].length; j++) {

                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];

            }
        }

        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());

            System.out.println(arr[n][m]);
        }

    }

}
