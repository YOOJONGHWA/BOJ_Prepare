package BOJ.bruteForce;

import java.util.Scanner;

public class BOJ2839 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = findNumber(n);

        System.out.println(result);
    }

    private static int findNumber(int n) {
        int result = 0;

        // n이 5로 나누어 떨어지는지 확인
        if (n % 5 == 0) {
            result = n / 5;
            return result;
        }

        // 그렇지 않으면 3kg 봉지 사용을 시도
        while (n > 0 && n % 5 != 0) {
            n -= 3;
            result++;
        }

        // n이 음수가 되면, 무게를 만들 수 없음
        if (n < 0) {
            return -1;
        }

        // 그렇지 않으면 결과를 반환
        return result + n / 5;
    }

}






















