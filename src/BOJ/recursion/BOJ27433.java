package BOJ.recursion;

import java.util.Scanner;

public class BOJ27433 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = makeN(n);
        System.out.println(result);

    }

    private static int makeN(int n) {

        if (n <= 1) return 1;
        return n * makeN(n -1);

    }

}
