package BOJ.recursion;

import java.util.Scanner;

public class BOJ27433 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long result = findN(n);
        System.out.println(result);

    }
    public static Long findN(long n) {

        if(n <= 1) {
            return 1L;
        }

        return n * findN(n-1);
    }
}
