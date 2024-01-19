package BOJ.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ1764 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> setN = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setN.add(br.readLine());
        }

        HashSet<String> setM = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setM.add(br.readLine());
        }
        HashSet<String> result = new HashSet<>(setN);
        result.retainAll(setM);

        int count = result.size();
        System.out.println(count);

        String[] resultArray = result.toArray(new String[0]);
        for (String name : resultArray) {
            System.out.println(name);
        }
    }
}
