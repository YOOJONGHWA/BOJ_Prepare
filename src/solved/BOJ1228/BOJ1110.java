package solved.BOJ1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1110 {

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        String s = String.valueOf(n);
//        if (n < 10) {
//            s = "0" + s;
//        }
//
//        char[] ch = s.toCharArray();
//        int count = 0;
//        while (true) {
//
//            count++;
//            int sum = Integer.parseInt(String.valueOf(ch[0])) + Integer.parseInt(String.valueOf(ch[1]));
//            String str2 = String.valueOf(sum);
//            char[] ch2 = str2.toCharArray();
//            int num = Integer.parseInt(String.valueOf(ch2[ch2.length-1]));
//            ch = (ch[1] + String.valueOf(num)).toCharArray();
//
//            String str1 = String.valueOf(ch);
//            if (s.equals(str1)) {
//                break;
//            }
//        }
//        System.out.println(count);
//    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int origin = n;
        int count = 0;
        do {
            int left = n / 10;
            int right = n % 10;
            int sum = left + right;
            n = (right * 10) + (sum % 10);
            count++;
        }
        while (n != origin);

        System.out.println(count);
    }

}
