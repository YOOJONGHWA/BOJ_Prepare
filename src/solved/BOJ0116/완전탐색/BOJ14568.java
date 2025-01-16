package solved.BOJ0116.완전탐색;

import java.util.Scanner;

public class BOJ14568 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n; j++) {

                for (int k = 0; k <= n; k++) {

                    if (i + j + k == n) {

                        if (k >= j + 2) {

                            if (i != 0 && j != 0 && k != 0) {

                                if (i % 2 == 0) {
                                    count++;
                                }

                            }

                        }

                    }

                }
            }

        }

        System.out.println(count);
    }
}
