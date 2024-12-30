package solved.BOJ1230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10610X {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();

        int sum = 0;
        boolean isZero = false;
        for (char c : chars) {

            sum += c - '0';
            if (c == '0') isZero = true;

        }

        if (!isZero || sum % 3 != 0) {
            System.out.println("-1");
        }
        else {
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder(new String(chars));
            System.out.println(sb.reverse().toString());
        }
    }

}
