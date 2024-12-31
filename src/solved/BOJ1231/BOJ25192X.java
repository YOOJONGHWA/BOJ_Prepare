package solved.BOJ1231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ25192X {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int total = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                total += set.size();
                set.clear();
            } else {
                set.add(str);
            }
        }

        total += set.size();

        System.out.println(total);
    }
}
