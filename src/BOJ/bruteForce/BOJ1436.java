package BOJ.bruteForce;

import java.util.Scanner;

public class BOJ1436 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = findNumber(N);
        System.out.println(result);

    }
    private static int findNumber(int n) {
        int number = 666;
        int count = 0;

        while (true) {

            if (String.valueOf(number).contains("666")) {
                count++;
                if (count == n) {
                    return number;
                }

            }
            number++;
        }
    }
}
