package solved.BOJ0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

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
            int left = 0;
            int right = n - 1;

            while (left < right) {
                // 자신을 제외한 두 수를 선택해야 하므로
                if (left == i) {
                    left++;
                    continue;
                }
                if (right == i) {
                    right--;
                    continue;
                }

                int sum = arr[left] + arr[right];

                if (sum == arr[i]) { // 좋은 수 발견
                    count++;
                    break;
                } else if (sum < arr[i]) { // 합이 작으면 왼쪽 포인터 이동
                    left++;
                } else { // 합이 크면 오른쪽 포인터 이동
                    right--;
                }
            }
        }

        System.out.println(count);
    }
}
