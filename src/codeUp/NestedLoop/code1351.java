package codeUp.NestedLoop;

import java.util.Scanner;

public class code1351 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int startDan = sc.nextInt();
        int endDan = sc.nextInt();

        for (int i = startDan; i <= endDan; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }

    }

}
