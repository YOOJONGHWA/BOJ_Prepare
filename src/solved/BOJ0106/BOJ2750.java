package solved.BOJ0106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
*   버블 정렬
*
*   인접한 두 수를 비교 해서 정렬 하는 방법
*
* */

public class BOJ2750 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        for (int ans : arr) {
            System.out.println(ans);
        }

    }

}
