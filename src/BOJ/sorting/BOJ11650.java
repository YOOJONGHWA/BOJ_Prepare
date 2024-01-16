package BOJ.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11650 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] chr = new String[n];

        for (int i = 0; i < chr.length; i++) {
            chr[i] = br.readLine();
        }

        Arrays.sort(chr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            if (!chr[i].equals(chr[i-1])) {
                sb.append(chr[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
