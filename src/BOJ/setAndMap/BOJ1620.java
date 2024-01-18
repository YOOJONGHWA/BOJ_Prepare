package BOJ.setAndMap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int poketMon = Integer.parseInt(st.nextToken());
        int quetion = Integer.parseInt(st.nextToken());

        Map<String,Integer> nameToNumber = new HashMap<>(); // 이름을 키로
        Map<Integer,String> numberToName = new HashMap<>(); // 순서를 키로

        for (int i = 1; i <= poketMon; i++) {
            String name = br.readLine();
            nameToNumber.put(name,i);
            numberToName.put(i,name);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int j = 0; j < quetion; j++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {       // 첫글자가 숫자인지 문자인지 판별
                int number = Integer.parseInt(input);
                bw.write(numberToName.get(number)+ "\n");
            }
            else {
                bw.write(nameToNumber.get(input)+ "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
