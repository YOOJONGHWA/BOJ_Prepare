package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int result = 0;
        int contiune = 0;
        for (int i = 0; i < t; i++) {

            String s = br.readLine();
            char[] ch = s.toCharArray();
            for (char c : ch) {
                if (c == 'O') {
                    contiune++;
                }
                else {
                    contiune = 0;
                }
                result += contiune;
            }
            System.out.println(result);
            contiune = 0;
            result = 0;
        }

    }

}
