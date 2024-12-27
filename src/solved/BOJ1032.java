package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        char[] pattern = arr[0].toCharArray();

        for (int i = 1; i < n; i++) {
            char[] temp = arr[i].toCharArray();
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j] != temp[j]) {
                    pattern[j] = '?';
                }
            }
        }

        System.out.println(new String(pattern));
    }
}
