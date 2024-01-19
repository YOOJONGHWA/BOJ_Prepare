package BOJ.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ20920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int countMax = 0;
        int wordLength = 0;
        HashMap<String,Integer> wordsBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String word = st.nextToken();
            int count = wordsBook.getOrDefault(word,0) + 1;
            if (word.length() > m) {
                wordsBook.put(word, count);
                if (countMax < count) {
                    countMax = count;
                }
                else if(wordLength < word.length()) {
                    wordLength = word.length();
                }
                else {
                }
            }

        }
    }
}
