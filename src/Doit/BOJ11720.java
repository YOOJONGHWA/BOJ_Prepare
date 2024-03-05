package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = new char[N];
        String num = br.readLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);


        String sNum = "1234";
        int i1 = Integer.parseInt(sNum);
        int i2 = Integer.valueOf(sNum);
        double d = Double.valueOf(sNum);
        float f = Float.valueOf(sNum);
        long l = Long.parseLong(sNum);
        short s = Short.parseShort(sNum);
    }
}
