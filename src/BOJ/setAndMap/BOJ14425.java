package BOJ.setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ14425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int count = 0;
        for (int j = 0; j < m; j++) {
            String str = br.readLine();
            if (set.contains(str)) {
                count++;
            }
        }
        System.out.println(count);

//        String[] arrTotal = new String[n+m];
//
//        for (int i = 0; i < arrTotal.length; i++) {
//            arrTotal[i] = br.readLine();
//        }
//
//        String[] arrN = new String[n];
//        for (int j = 0; j < arrTotal.length-m; j++) {
//            arrN[j] = arrTotal[j];
//        }
//
//        String[] arrM = new String[m];
//        for (int k = n; k < arrTotal.length; k++) {
//            arrM[k - n] = arrTotal[k];
//        }
//
//        HashSet<String> setN = new HashSet<>(List.of(arrN));
//        HashSet<String> setM = new HashSet<>(List.of(arrM));
//
//        HashSet<String> findSame = new HashSet<>(setN);
//        findSame.retainAll(setM);
//        System.out.println(findSame.size());
    }
}
