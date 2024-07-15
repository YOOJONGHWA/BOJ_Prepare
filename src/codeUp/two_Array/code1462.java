package codeUp.two_Array;

import java.util.Scanner;

public class code1462 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[][] array = new int[n][n];

        // 값을 배열에 채워넣기
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                array[row][col] = row * n + (col + 1);
            }
        }

        // 배열 출력
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
