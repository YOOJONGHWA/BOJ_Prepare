package codeUp.NestedLoop;

import java.util.Scanner;

public class code1357 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int length = a + (a - 1);

        for (int i = 0; i < length; i++) {
            if (i < a) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 0; j < length - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
