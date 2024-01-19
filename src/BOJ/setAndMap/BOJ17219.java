package BOJ.setAndMap;

import java.io.*;
import java.util.*;

public class BOJ17219 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,String> mapN = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String site = st.nextToken();
            String password = st.nextToken();
            mapN.put(site,password);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 비밀번호를 찾으려는 사이트 주소에 대해 출력
        for (int i = 0; i < m; i++) {
            String inputSite = br.readLine();
            String findPass = mapN.get(inputSite);
            bw.write(findPass + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
