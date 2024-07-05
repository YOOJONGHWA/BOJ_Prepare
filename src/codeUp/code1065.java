package codeUp;

import java.util.Scanner;

public class code1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
