package BOJ.twoArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2566 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int max = Integer.MIN_VALUE;
//        int col = 0 , row = 0;
//
//        int[][] array = new int[9][9];
//        for (int i = 0; i < 9; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine()," ");
//            for (int j = 0; j < 9; j++) {
//                array[i][j] = Integer.parseInt(st.nextToken());
//
//                if (max < array[i][j]) {
//                    max = array[i][j];
//                    row = i + 1;
//                    col = j + 1;
//                }
//            }
//        }
//        System.out.println(max + "\n" + row + " " + col);
//    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int col = 0, row = 0;
        for (int i = 0; i < 9; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                    col = i + 1;
                    row = j + 1;
                }

            }
        }
        System.out.println(max + "\n" + col +" " + row);

    }
















}
