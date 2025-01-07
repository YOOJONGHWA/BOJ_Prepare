package solved.BOJ0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1817 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int books = Integer.parseInt(st.nextToken());
        int boxWeight = Integer.parseInt(st.nextToken());

        if (books == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[books];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < books; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 1;
        int currentWeight = 0;

        for (int weight : arr) {
            if (currentWeight + weight > boxWeight) {
                count++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }

        System.out.println(count);
    }
}
