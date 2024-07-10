package codeUp.string;

import java.util.Scanner;

public class code1408 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder passOne = new StringBuilder();
        StringBuilder passTwo = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char password  = (char) (c + 2);
            passOne.append(password);
            char password2 = (char) ((c * 7) % 80 + 48);
            passTwo.append(password2);
        }
        System.out.println(passOne.toString() + "\n" + passTwo.toString());

    }

}
