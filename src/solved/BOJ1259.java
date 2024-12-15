package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1259 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            StringBuilder sb = new StringBuilder(str);
            String reversed = sb.reverse().toString();

            if (str.equals("0")) break;

            if (str.equals(reversed)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
