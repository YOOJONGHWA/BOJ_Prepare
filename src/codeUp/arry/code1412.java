package codeUp.arry;

import java.util.Scanner;

public class code1412 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        // 알파벳 개수를 저장할 배열
        int[] alphabetCount = new int[26];

        // 문자열을 소문자로 변환하고 각 문자를 순회
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 알파벳인 경우에만 카운트
            if (c >= 'a' && c <= 'z') {
                alphabetCount[c - 'a']++;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 'a') + ":" + alphabetCount[i]);
        }
    }
}
