package codeUp.two_Array;

import java.util.Scanner;

public class code1461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            int start = (i + 1) * n;
            for (int j = 0; j < n; j++) {
                array[i][j] = start - j;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
