package BOJ.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int length = num.length();

        String[] str = new String[length];

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(num.charAt(i));
        }

        Arrays.sort(str, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String arr : str) {
            sb.append(arr);
        }
        System.out.println(sb);
    }
}
