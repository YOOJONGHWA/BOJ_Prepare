package BOJ.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder[] sb = new StringBuilder[201];
        for(int i = 0; i < sb.length; i++) {

            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            sb[age].append(age).append(" ").append(name).append("\n");
        }

        StringBuilder builder = new StringBuilder();
        for (StringBuilder result : sb) {
            builder.append(result);
        }

        System.out.println(builder);
    }
}
