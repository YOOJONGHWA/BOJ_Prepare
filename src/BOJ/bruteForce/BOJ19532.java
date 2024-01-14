package BOJ.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19532 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        // ax +by = c
        // dx +ey = f

        int determinant = a * e - b * d;
        int x = (c * e - f * b)/ determinant;
        int y = (a * f - d * c)/ determinant;
        System.out.println(x + " " + y);



    }

}
/*
*     행렬식  a b      = ab -bc
*            c d
*     x = c1b2 - c2b1/ 행렬식
* */
