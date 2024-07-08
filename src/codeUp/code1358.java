package codeUp;

import java.util.Scanner;

public class code1358 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i -1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
