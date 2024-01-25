package BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] total = new int[9];
        int[] find = new int[7];
        for (int i = 0; i < 9; i++) {
            total[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < total.length; i++) {
            for (int j = i + 1; j < total.length; j++) {
                int sum = 0;
                int index = 0;
                for (int k = 0; k < total.length; k++) {
                    if (k != i && k != j) {
                        find[index++] = total[k];
                        sum += total[k];
                    }
                }
                if (sum == 100) {
                    Arrays.sort(find);
                    for (int result : find) {
                        System.out.println(result);
                    }
                    return;
                }
            }
        }
    }
}
