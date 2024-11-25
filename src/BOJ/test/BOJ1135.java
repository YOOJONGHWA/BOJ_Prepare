package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1135 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String letter = br.readLine();
            if (letter.equals("END")) break;
            sb.append(new StringBuilder(letter).reverse().append("\n"));
        }
        System.out.print(sb);
    }

}
