package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String words = br.readLine().trim();
        
        int count = countFuntion(words);

        System.out.println(count);



    }
    private  static int countFuntion(String inputString) {
        if (inputString.isEmpty()) {
            return 0;
        }
        String[] words = inputString.split(" ");
        return words.length;
    }

}
