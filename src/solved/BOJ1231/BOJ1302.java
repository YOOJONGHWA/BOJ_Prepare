package solved.BOJ1231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ1302 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        String book = "";


        /*
        *
        *   compareTo() 메서드
        *   compareTo() 메서드는 두 문자열을 사전순으로 비교하고, 다음과 같은 값을 반환합니다:
        *
        *   0보다 작은 값: 첫 번째 문자열이 두 번째 문자열보다 사전순으로 앞에 위치 (즉, 첫 번째 문자열이 두 번째 문자열보다 작다).
        *   0: 두 문자열이 동일하다.
        *   0보다 큰 값: 첫 번째 문자열이 두 번째 문자열보다 사전순으로 뒤에 위치 (즉, 첫 번째 문자열이 두 번째 문자열보다 크다).
        *
        * */

        for (String key : map.keySet()) {
            int count = map.get(key);

            if (count > max || (count == max && key.compareTo(book) < 0)) {
                max = count;
                book = key;
            }
        }

        System.out.println(book);
    }
}
