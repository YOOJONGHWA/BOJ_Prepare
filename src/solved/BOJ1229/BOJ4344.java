package solved.BOJ1229;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int person = Integer.parseInt(st.nextToken());
            int[] arr = new int[person];
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < person; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            avg = sum / person;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }
            double result = ((double) count / person) * 100;
            System.out.printf("%.3f%%\n", result);
        }

    }

}
