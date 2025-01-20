package solved.BOJ0119.정수론;

import java.util.Scanner;

public class BOJ11653 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int num = 2;
        while (target > 1) {

            if (target % num == 0) {
                target /= num;
                sb.append(num).append("\n");
            } else {
                num++;
            }
        }

        sc.close();
        System.out.println(sb.toString());

    }
}
