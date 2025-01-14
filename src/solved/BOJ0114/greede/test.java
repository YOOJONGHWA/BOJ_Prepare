package solved.BOJ0114.greede;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        long result = num.charAt(0) - '0';
        for (int i = 1; i < num.length(); i++) {

            int number = num.charAt(i) - '0';
            if (result <= 1 || number <= 1) {
                result += number;
            }
            else {
                result *= number;
            }

        }
        System.out.println(result);
    }

}
