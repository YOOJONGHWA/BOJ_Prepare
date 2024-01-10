package BOJ.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] chess = {1,1,2,2,2,8};
        int[] whitePess = new int[6];

        for (int i = 0 ; i < chess.length; i ++) {
            whitePess[i] = Integer.parseInt(st.nextToken());
            whitePess[i] = calculateDifer(chess[i],whitePess[i]);
        }
        for (int difference : whitePess) {
            System.out.print(difference + " ");
        }

    }
    private static int calculateDifer(int chess, int whitePess) {
        return chess - whitePess;
    }

}
