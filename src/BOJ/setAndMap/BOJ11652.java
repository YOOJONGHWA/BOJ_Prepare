package BOJ.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ11652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cardNum = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> cardMap = new HashMap<>();

        int max = 0;
        long x = 0;
        for (int i = 0; i < cardNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            Long cards = Long.parseLong(st.nextToken());
            int count = cardMap.getOrDefault(cards,0) + 1;
            cardMap.put(cards,count);

            if (count > max || max == count && cards < x) {
                max = count;
                x = cards;
            }
        }
        System.out.println(x);
    }
}
