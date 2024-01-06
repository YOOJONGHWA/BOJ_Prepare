package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 단어 입력 받기
        String word = br.readLine();

        // 위치 입력 받기
        int position = Integer.parseInt(br.readLine());

        // i번째 글자 출력
        char result = word.charAt(position - 1);
        System.out.println(result);

    }

}
