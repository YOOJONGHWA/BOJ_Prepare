package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] arr = new int[26];

        Arrays.fill(arr,-1);

        for(int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int index = currentChar - 'a';

            if (arr[index] == -1) {
                arr[index] = i;
            }
        }
        for (int position : arr) {
            System.out.print(position + " ");
        }
        br.close();
    }
}
