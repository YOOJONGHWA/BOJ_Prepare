package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        String[] store = new String[T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            store[i] = newString(R, S);
        }
        for (String num : store) {
            System.out.println(num + " ");
        }
    }

    private static String newString(int roof, String chars) {
        StringBuilder sb = new StringBuilder();
        for (char ch : chars.toCharArray()) {
            for (int i = 0; i < roof; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}


