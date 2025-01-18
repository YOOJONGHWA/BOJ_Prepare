package solved.BOJ0116.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int rowSize = Integer.parseInt(st.nextToken());
        int colSize = Integer.parseInt(st.nextToken());

        char[][] chessBored = new char[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            chessBored[i] = br.readLine().toCharArray();
        }

        int count = Integer.MAX_VALUE;
        for (int row = 0; row <= rowSize - 8; row++) {

            for (int col = 0; col <= colSize - 8; col++) {

                int changWhite = cheakBoard(chessBored,row, col, 'W');
                int changBlack = cheakBoard(chessBored,row, col, 'B');
                count = Math.min(count, Math.min(changWhite, changBlack));
            }
        }
        System.out.println(count);
    }

    private static int cheakBoard(char[][] chessBored, int row, int col, char firstColor) {

        int changeCount = 0;
        char currentColor = firstColor;

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                if (chessBored[row + i][col + j] != currentColor) {
                    changeCount++;
                }
                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            currentColor = (currentColor == 'W') ? 'B' : 'W';

        }

        return changeCount;
    }
}
