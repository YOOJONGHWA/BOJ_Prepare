package BOJ.ElemMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int result = calculate(A, B, C);

        System.out.println(result);
    }

    private static int calculate(int day, int night, int height) {
        int dayCount = 0;
        int result = 0;

        while (true) {
            result += day;
            dayCount++;

            if (result > height) {
                break;
            }
            result -= night;
        }
        return dayCount;
    }
}
