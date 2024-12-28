package solved.BOJ1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class BOJ1145X {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long[] arr = new long[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        long number = arr[0];
        while (true) {

            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (number % arr[i] == 0) {
                    count++;
                }
            }

            if(count >= 3) {
                System.out.println(number);
                break;
            }
            number++;
        }

    }

}
