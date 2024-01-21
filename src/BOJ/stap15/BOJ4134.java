package BOJ.stap15;

import java.util.Scanner;

public class BOJ4134 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int result = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            result = findNum(arr[i]);
            sb.append(result).append("\n");
        }
        System.out.println(sb);

    }

    private static int findNum(int i) {
        int result = i + 1;
        while (true) {
            if (result % 2 != 0 && result % result == 0) {
                return result;
            }
            result++;
        }
    }

}
