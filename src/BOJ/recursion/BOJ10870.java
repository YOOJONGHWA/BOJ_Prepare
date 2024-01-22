package BOJ.recursion;

import java.util.Scanner;

public class BOJ10870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int result = fibonacci(num);
        System.out.println(result);
    }

    private static int fibonacci(int num) {

        if (num == 1) return 1;
        if (num == 0) return 0;

        return fibonacci(num - 1) + fibonacci(num - 2);

    }
}
