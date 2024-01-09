package BOJ.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int totalTime = 0;
        for(int i = 0; i < word.length(); i++) {
            totalTime += calculateTime(word.charAt(i));
        }
        System.out.println(totalTime);

    }
    private static int calculateTime(char word) {
        if(word == 'A' || word == 'B' || word == 'C') {return 3;}
        if(word == 'D' || word == 'E' || word == 'F') {return 4;}
        if(word == 'G' || word == 'H' || word == 'I') {return 5;}
        if(word == 'J' || word == 'K' || word == 'L') {return 6;}
        if(word == 'M' || word == 'N' || word == 'O') {return 7;}
        if(word == 'P' || word == 'Q' || word == 'R' || word == 'S') {return 8;}
        if(word == 'T' || word == 'U' || word == 'V') {return 9;}
        if(word == 'W' || word == 'X' || word == 'Y' || word == 'Z') {return 10;}
        return 2;
    }
}
