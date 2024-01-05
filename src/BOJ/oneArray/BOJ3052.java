package BOJ.oneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> calculator = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int cal = num % 42;
            calculator.add(cal);
        }
        System.out.println(calculator.size());

    }
}
/*
* HashSet은 자바에서 Set 인터페이스를 구현한 클래스 중 하나로, 중복된 값을 허용하지 않고, 순서를 보장하지 않습니다.
* 이 문제에서는 42로 나눈 나머지를 구하고, 서로 다른 값의 개수를 세야 했으므로 중복된 값을 허용하지 않는 HashSet이 적합했습니다.
* */
