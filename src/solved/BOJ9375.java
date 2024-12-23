package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ9375 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < num; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String cloths = st.nextToken();
                map.put(cloths, map.getOrDefault(cloths, 0) + 1);
            }

            int result = 1;
            for (int answer : map.values()) {
                result *= (answer + 1);
            }
            System.out.println(result -1);
        }

    }

}
