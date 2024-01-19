package BOJ.stap15;

import java.util.Scanner;

public class BOJ13241 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long num2 = sc.nextLong();
        long gcdFind = gcdFind(num,num2);
        long result = ((num * num2) / gcdFind);
        System.out.println(result);
    }

    private static long gcdFind(long a, long b) {
        if(b == 0) return a;
        return gcdFind(b, a % b);
    }

}
