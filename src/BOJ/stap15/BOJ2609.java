package BOJ.stap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = findGcd(a,b);
        int lcm = (a * b) / gcd;
        System.out.println(gcd + "\n" + lcm);

    }

    private static int findGcd(int a, int b) {

//        while (b !=0) {
//            int r = a % b;
//            a = b;
//            b = r;
//        }
//        return a;
        if (b == 0) return a;
        return findGcd(b, a % b);
    }

}
