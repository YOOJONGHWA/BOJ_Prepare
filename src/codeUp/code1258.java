package codeUp;

import java.util.Scanner;

public class code1258  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        for (int i = 0; i < a + 1; i++) {
            result += i;
        }
        System.out.println(result);
    }

}

