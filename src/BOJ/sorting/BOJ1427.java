package BOJ.sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ1427 {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String num = br.readLine();
//        int length = num.length();
//
//        String[] str = new String[length];
//
//        for (int i = 0; i < str.length; i++) {
//            str[i] = String.valueOf(num.charAt(i));
//        }
//
//        Arrays.sort(str, Comparator.reverseOrder());
//        StringBuilder sb = new StringBuilder();
//        for(String arr : str) {
//            sb.append(arr);
//        }
//        System.out.println(sb);




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num = br.readLine();
        int length = num.length();
        String [] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = String.valueOf(num.charAt(i));
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for (String asd : arr) {
            sb.append(asd);
        }
        System.out.println(sb);








    }
}
