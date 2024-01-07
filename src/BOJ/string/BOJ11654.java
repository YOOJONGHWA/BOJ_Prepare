package BOJ.string;

import java.util.Scanner;

public class BOJ11654 {

    public static void main(String[] args) {

        // Scanner를 사용하여 알파벳 소문자, 대문자, 숫자 0-9 중 하나를 입력 받습니다.
        Scanner scanner = new Scanner(System.in);
        char myChar = scanner.next().charAt(0);

        // 입력 받은 문자의 아스키 코드 값을 출력합니다.
        int asciiCode = (int) myChar;
        System.out.println(asciiCode);

        scanner.close();
    }
}
