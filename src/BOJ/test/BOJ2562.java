package BOJ.test;

import java.util.Scanner;

public class BOJ2562 {

    public static void main(String[] args) {

        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            // 최댓값을 갱신할 때만 index를 업데이트
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1; // 1-based index
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
