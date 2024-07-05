package codeUp;

import java.util.Scanner;

public class code1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        System.out.println(min);
    }
}
