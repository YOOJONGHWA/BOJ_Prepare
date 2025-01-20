package solved.BOJ0119.정수론;

import java.util.Scanner;

public class BOJ1407 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();     // 176
        long b = sc.nextLong();     // 177

        a -= 1;

        long tmp_A = a;
        for (int i = 1; i < 50; i++) {
            long powerOf2 = (long) Math.pow(2, i);  // 2^i 계산
            tmp_A += (a / powerOf2) * (powerOf2 - Math.pow(2, i - 1));
        }

        long tmp_B = b;
        for (int i = 1; i < 50; i++) {
            long powerOf2 = (long) Math.pow(2, i);  // 2^i 계산
            tmp_B += (b / powerOf2) * (powerOf2 - Math.pow(2, i - 1));
        }

        System.out.println(tmp_B - tmp_A);
    }
}
