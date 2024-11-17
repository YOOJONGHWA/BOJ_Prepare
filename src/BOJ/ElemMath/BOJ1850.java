package BOJ.ElemMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1850 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        Long N = Long.parseLong(st.nextToken());
        Long M = Long.parseLong(st.nextToken());

        Long gcdNum = gcd(N,M);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcdNum; i++) {
            sb.append("1");
        }

        System.out.println(sb.toString());

    }
    public static Long gcd(Long a, Long b) {

        if (b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }

}
