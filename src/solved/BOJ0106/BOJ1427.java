package solved.BOJ0106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*   최솟값 또는 최댓값을 찾고, 남은 정렬 부분의 가장앞에 있는 데이터 와 스왑 하는 것이 선택 정렬
*
* */

public class BOJ1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int[] arr = new int[num.length()];

        char[] ch = num.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            arr[i] = ch[i] - '0';
        }

        for (int i = 0; i < arr.length; i++) {

            int max = i;
            for (int j = i + 1; j < arr.length; j++) {

                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            if (arr[i] < arr[max]) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }

        }
        for (int ans : arr) {
            System.out.print(ans);
        }

    }

}
