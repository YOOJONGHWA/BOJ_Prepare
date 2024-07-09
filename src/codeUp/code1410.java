package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class code1410 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        String[] arr = new String[input.length()];
        int open = 0;
        int close = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(input.charAt(i));
            if (Objects.equals(arr[i], "(")) open++;
            if (Objects.equals(arr[i], ")")) close++;
        }
        System.out.println(open + " " + close);
    }

}
