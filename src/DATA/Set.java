package DATA;

import java.util.Arrays;
import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        // 집합 자료형의 2가지 특징
        // 중복을 허용하지 않는다.
        // 순서가 없다(unordered).

        // 리스트나 배열은 순서가 있기(ordered) 때문에 인덱싱을 통해 자료형의 값을 얻을 수 있지만
        // 집합 자료형은 순서가 없기(unordered) 때문에 인덱싱으로 값을 얻을 수 없다. 이는 마치 맵 자료형과 비슷하다.
        // 맵 자료형 역시 순서가 없는 자료형이라 인덱싱을 지원하지 않는다.
        // 집합 자료형은 중복을 허용하지 않기 때문에 자료형의 중복을 제거하기 위한 필터 역할로 종종 사용한다.

        // 집합 자료형은 교집합, 합집합, 차집합을 구할 때 유용하다.

        // 교집합 구하기
        // retainAll
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력

        // 합집합 구하기
        HashSet<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s4 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> union = new HashSet<>(s3);  // s3으로 union 생성
        union.addAll(s4); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        // 차집합 구하기
        HashSet<Integer> s5 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s6 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> substract = new HashSet<>(s5);  // s1으로 substract 생성
        substract.removeAll(s6); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력

    }

}
