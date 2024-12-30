package solved.BOJ1230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2748O {

    static Long[] arr = new Long[91];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        arr[0] = 0L;
        arr[1] = 1L;

        System.out.println(fibonacci(num));

    }

    private static Long fibonacci(int num) {

        if (arr[num] == null) {
            arr[num] = fibonacci(num - 1) + fibonacci(num - 2);
        }
        return arr[num];
    }

}
