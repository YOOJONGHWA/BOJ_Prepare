package solved.BOJ1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ1157X {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String upperStr = str.toUpperCase();
        char[] chars = upperStr.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (char key : map.keySet()) {
            int num = map.get(key);

            if (num > max) {
                max = num;
                maxChar = key;
                isDuplicate = false;
            }
            if (num == max) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }
    }
}
