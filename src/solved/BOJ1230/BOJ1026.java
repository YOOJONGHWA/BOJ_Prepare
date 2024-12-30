package solved.BOJ1230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr2 = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);
        int[] arr2Reverse = new int[n];
        int index = 0;
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2Reverse[index++] = arr2[i];
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i] * arr2Reverse[i];
        }
        System.out.println(result);
    }
}
