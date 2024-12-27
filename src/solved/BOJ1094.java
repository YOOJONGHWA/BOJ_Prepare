package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] lengths = {64, 32, 16, 8, 4, 2, 1};

        int count = 0;
        for (int length : lengths) {
            if (num >= length) {
                num -= length;
                count++;
            }

            if (num == 0) {
                break;
            }
        }
        System.out.println(count);

    }

}
