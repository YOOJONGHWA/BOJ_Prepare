package solved.BOJ1231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11656 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();;
        String[] arr = new String[str.length()];

        arr[0] = str;

        for (int i = 1; i < str.length(); i++) {
            arr[i] = str.substring(i, str.length());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }

}
