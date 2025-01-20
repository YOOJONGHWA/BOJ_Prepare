package solved.BOJ0119.정수론;

import java.util.Scanner;

public class BOJ11653 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= Math.sqrt(target); i++) {

            while (target % i == 0) {
                target /= i;
                sb.append(i).append("\n");
            }
        }

        if (target > 1) {
            sb.append(target).append("\n");
        }
        sc.close();
        System.out.println(sb.toString());

    }
}
