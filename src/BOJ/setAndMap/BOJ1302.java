package BOJ.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class BOJ1302 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int salesBook = Integer.parseInt(br.readLine());
        String[] bookTitle = new String[1001];
        int[] countBook = new int[1001];
        for (int i = 0; i < salesBook; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            bookTitle[i] = st.nextToken();
            if (Objects.equals(bookTitle[i], bookTitle[i + 1])) {
                countBook[i]++;
            }
        }

    }

}
