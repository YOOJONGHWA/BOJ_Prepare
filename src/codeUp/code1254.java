package codeUp;

import java.util.Scanner;

public class code1254 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char start = sc.next().charAt(0);
        char end = sc.next().charAt(0);

        makeAlphbat(start,end);

    }
    public static void makeAlphbat(char start, char end) {
        for (char i = start; i <= end; i++) {
            System.out.println(i + " ");
        }
    }

}
