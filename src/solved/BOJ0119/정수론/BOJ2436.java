package solved.BOJ0119.정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long gcd = Long.parseLong(st.nextToken());
        long lcm = Long.parseLong(st.nextToken());

        long target = lcm / gcd;

        long x = 1; long y= target;
        for (long i = x; i * i <= target; i++) {

            if (target % i == 0) {
                long targetX = i;
                long targetY = target / i;

                if (gcd(targetX, targetY) == 1) {
                    x = targetX;
                    y = targetY;
                }

            }
        }

        long a = x * gcd;
        long b = y * gcd;

        System.out.println(a + " " + b);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
