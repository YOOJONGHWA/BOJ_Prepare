package solved.BOJ0114.greede;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int[] personNum = new int[number];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < number; i++) {
            personNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(personNum);

        int result = 0;
        int count = 0;
        for (int i = 0; i < personNum.length; i++) {

            count += 1;
            if (count >= personNum[i]) {
                result += 1;
                count = 0;
            }

        }
        System.out.println(result);

    }

}
