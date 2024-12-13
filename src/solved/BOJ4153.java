package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0){
                break;
            }

            int[] arr = new int[3];
            Arrays.sort(arr);

            int multiA = arr[0] * arr[0];
            int multiB = arr[1] * arr[1];
            int multiC = arr[2] * arr[2];

            System.out.println(multiA + multiB == multiC ? "right" : "wrong");

        }

    }

}
