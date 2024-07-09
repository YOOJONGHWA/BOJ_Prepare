package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code1407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = str.replaceAll(" ", "");
        System.out.println(result);
    }
}
