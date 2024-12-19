package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int k = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] lengths = new int[k];
        int mexLength = 0;

        for (int i = 0; i < k; i++) {
            lengths[i] = Integer.parseInt(br.readLine());
            mexLength = Math.max(mexLength, lengths[i]);
        }

        long low = 1;
        long high = mexLength;

        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            long count = 0;

            for (int length : lengths) {
                count += length / mid;
            }

            if (count >= m) {
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(result);
    }

}
