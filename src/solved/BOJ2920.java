package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ2920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "ascending");
        map.put(2, "descending");
        map.put(3, "mixed");

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 7; i++) {
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        int result;
        if (isAscending) {
            result = 1; // ascending
        } else if (isDescending) {
            result = 2; // descending
        } else {
            result = 3; // mixed
        }

        System.out.println(map.get(result));
    }
}
