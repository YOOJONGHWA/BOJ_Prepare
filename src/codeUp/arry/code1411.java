package codeUp.arry;

import java.io.IOException;
import java.util.Scanner;

public class code1411 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int totalSum = 0;
        int lessSum = 0;
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = i + 1;
            totalSum += arr[i];
        }
        int[] arr2 = new int[total - 1];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            lessSum += arr2[i];
        }
        System.out.println(totalSum - lessSum);
    }

}
