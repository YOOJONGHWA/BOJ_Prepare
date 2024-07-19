package TeamCode;

import java.util.Scanner;

public class BJ2869 {
    public static void main(String[] args) {

        /*
        *
        *   2 - 1 = 1
        *   1 + 2 -1 = 2
        *   2 + 2 - 1 = 3
        *   3 + 2 - 1 = 4
        *   4 + 2 - 1 = 5
        * */

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        int days = (int)Math.ceil((double)(V - A) / (A - B)) + 1;

        // (5 - 2) / (2 - 1 ) + 1
        //    3   /  1  = 3 + 1
        //  V - A는  정상 높이
        //  A - B는 하루 동안의 순 이동 거리
        System.out.println(days);

    }
}
