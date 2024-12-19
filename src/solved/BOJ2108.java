package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ2108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            result += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Arrays.sort(arr);
        System.out.println(Math.round((double) result / N));
        System.out.println(arr[N / 2]);

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (Integer key : map.keySet()) {
            int num = map.get(key);
            if (num > max) {
                max = num;
                list.clear();
                list.add(key);
            }
            else if (num == max) {
                list.add(key);
            }
        }

        if (list.size() > 1) {
            list.sort(null);
            System.out.println(list.get(1));
        }
        else {
            System.out.println(list.get(0));
        }


        System.out.println(arr[arr.length - 1] - arr[0]);

    }

}
