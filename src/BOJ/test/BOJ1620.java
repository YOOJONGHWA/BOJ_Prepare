package BOJ.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] numberToName = new String[n + 1];
        HashMap<String, Integer> nameToNumber = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            numberToName[i] = name;
            nameToNumber.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                int number = Integer.parseInt(input);
                sb.append(numberToName[number]).append("\n");
            }
            else {
                sb.append(nameToNumber.get(input)).append("\n");
            }
        }
        System.out.println(sb);

    }

}
