package BOJ.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().trim();

        if(isPalindrome(word)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    private static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length/2; i++) {
            if(word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
