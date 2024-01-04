package DATA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List {

    public static void main(String[] args) {

        // ArrayList

        // ArrayList의 add 메서드를 사용하면 요솟값을 추가할 수 있다.
        // 야구 선수가 공을 총 3번 던졌는데 각각 시속 138, 129, 142(km/h)였다면
        // 다음과 같이 코드를 작성할 수 있다.

        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

       // 첫 번째 위치에 133이라는 투구 속도를 추가하고 싶다면
        pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
        System.out.println(pitches);

        // get
        // ArrayList의 get 메서드를 사용하면 특정 인덱스의 값을 추출할 수 있다.
        System.out.println(pitches.get(1)); // 138

        // size
        // size 메소드는 ArrayList의 요소의 개수를 리턴한다.
        System.out.println(pitches.size()); // 4

        // contains
        // contains 메서드는 리스트 안에 해당 항목이 있는지 판별해 그 결과를 boolean으로 리턴한다.
        System.out.println(pitches.contains("142"));

        // remove
        // remove(객체)
        // remove(인덱스)
        System.out.println(pitches.remove("129"));  // 129를 리스트에서 삭제하고, true를 리턴한다.
        System.out.println(pitches.remove(0));  // pitches의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 리턴한다.

        // 제네릭스
        // 자료형을 안전하게 사용할 수 있도록 만들어 주는 기능이다.
        // 제네릭스를 사용하면 자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류를 줄일 수 있다.

        ArrayList<String> pitches2 = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");

        String one = pitches2.get(0);  // 형 변환이 필요없다.
        String two = pitches2.get(1);  // 형 변환이 필요없다.


        // ArrayList 만들기
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches3);

        // String.join
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches4);
        System.out.println(result);  // 138,129,142 출력

        // 리스트 정렬하기
        ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
    }
}
