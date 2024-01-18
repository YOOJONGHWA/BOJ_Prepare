package BOJ.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();
            String status = st.nextToken();

            if (status.equals("enter")) {
                map.put(name,status);
            }
            else {
                map.remove(name);
            }
        }
        ArrayList<String> statusInOffice = new ArrayList<>(map.keySet());
        statusInOffice.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : statusInOffice) {
            sb.append(name).append("\n");
        }
        System.out.println(sb);
    }
}

