package solved.BOJ0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
*
*   이 문제의 핵심은 다른 두 수의 합으로 표현된다는 조건에 따라 자신을 포함하지 않는 두 수를 찾아야 한다는 점
*   왜 자신을 제외해야 하는가?
*   문제 정의:
*   "좋은 수"란 다른 두 수의 합으로 나타낼 수 있는 수입니다.
*
*   자신을 포함하면 생기는 문제:
*
*   만약 자신을 포함한다면, 자신과 같은 값으로 합을 만들 수 있습니다.
*   예를 들어, 배열에 [2, 2, 3]이 있을 때:
*   2 + 2 = 4가 성립한다고 하면, 자기 자신과 합을 만드는 경우가 발생합니다.
*
*   하지만 문제의 본질은 배열의 다른 두 요소를 이용해서 합을 구성하는 것입니다.
*
*
* */

public class BOJ1253X {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < n; i++) {

            int target = arr[i];
            int left = 0;
            int right = n - 1;

            while (left < right) {

                if (i == left) {
                    left++;
                    continue;
                }

                if (i == right) {
                    right--;
                    continue;
                }

                int sum = arr[left] + arr[right];
                if (sum == target) {
                    count++;
                    break;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }

            }

        }
        System.out.println(count);
    }
}
