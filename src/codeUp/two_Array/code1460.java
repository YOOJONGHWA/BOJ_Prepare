package codeUp.two_Array;

import java.util.Scanner;

public class code1460 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        for (int[] result : arr) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }

    }

}
