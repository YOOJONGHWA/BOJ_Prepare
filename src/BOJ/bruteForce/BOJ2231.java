package BOJ.bruteForce;

import java.util.Scanner;

public class BOJ2231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = findConstructorNumber(N);
        System.out.println(result);
    }

    private static int findConstructorNumber(int n) {

        for (int i = 1; i <= n; i++) {
            int sum = i;
            int minNumber = i;

            while (minNumber > 0) {
                sum += minNumber % 10;
                minNumber /= 10;
            }
            if (sum == n) {
                return i;
            }
        }
        return 0;
    }
}
