package codeUp.two_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code1098 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int[][] arr = new int[row][col];
        int h = Integer.parseInt(br.readLine());
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int l = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            for (int j = 0; j < l; j++) {
                if(d == 0) {
                    arr[x][y + j] = 1;
                }
                else {
                    arr[x + j][y] = 1;
                }
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
