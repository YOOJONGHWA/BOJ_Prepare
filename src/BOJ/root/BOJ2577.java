package BOJ.root;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a * b * c;
        String change = String.valueOf(result);
        int length = change.length();

        int[] count = new int[10];

        for (int i = 0; i < length; i++) {
            char digitChar = change.charAt(i);
            int num = Character.getNumericValue(digitChar);
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
