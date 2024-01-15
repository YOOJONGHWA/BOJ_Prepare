package BOJ.sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2587 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i] = Integer.parseInt(st.nextToken());
            result += arr[i] / arr.length;
        }
        Arrays.sort(arr);
        int median = arr[2];
        System.out.println(result + "\n" + median);
    }
}
