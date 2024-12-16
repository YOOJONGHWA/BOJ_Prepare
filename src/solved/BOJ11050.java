package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11050 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(nkFactorial(n) / (nkFactorial(k) * nkFactorial(n - k)));

    }

    private static int nkFactorial(int i) {
        if (i <= 0) return 1;
        return i * nkFactorial(i - 1);
    }

}
