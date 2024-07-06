package codeUp;

import java.util.Scanner;

public class code1287 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            // n * i의 결과만큼 '*' 출력
            for (int j = 0; j < A * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
