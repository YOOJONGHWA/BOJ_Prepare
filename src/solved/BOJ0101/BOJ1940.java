package solved.BOJ0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {

            int sum = arr[left] + arr[right];
            if (sum == num) {
                count++;
                left++;
                right--;
            }
            else if (sum > num) {
                right--;
            }
            else {
                left++;
            }
        }
        System.out.println(count);
        br.close();
    }



}
