package codeUp.string;

import java.util.Objects;
import java.util.Scanner;

public class code1414 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String upperCaseStr = str.toUpperCase();
        int countC = 0;
        int countCc = 0;
        for (int i = 0; i < upperCaseStr.length(); i++) {
            if (upperCaseStr.charAt(i) == 'C') {
                countC++;
            }
        }
        for (int i = 0; i < upperCaseStr.length() - 1; i++) {
            if (upperCaseStr.charAt(i) == 'C' && upperCaseStr.charAt(i + 1) == 'C') {
                countCc++;
            }
        }
        System.out.println(countC + "\n" + countCc);


    }

}
