package TeamCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869 {

    public static void main(String[] args) throws IOException {

//        2 - 1 = 1
//        1 + 2 - 1 = 2
//        2 + 2 - 1 =  3
//        3 + 2 - 1 =  4
//        4 + 2 - 1 =  5

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // int 타입 메서드 구현해서 처리
        int result = calculate(a, b, v);

        System.out.println(result);

    }
    public static int calculate(int day, int night, int height) {
        int days = 0;       // 몇일 인지 계산 하기 위해 저장한 변수
        int sum = 0;        // 높이를 계산하기 위해 저장한 변수

        while (true) {
            days++;         // 1일 시작!
            sum += day;
            if (sum >= height) {  // 함계된 높이가 지정한 높이 같거나 이상이면 브레이크
                break;
            }
            sum -= night;   // 그게 아니면 밤사이에 높이가 감소
        }
        return days;
    }
}
