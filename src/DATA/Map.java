package DATA;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        // 맵은 키(key)와 값(value)을 한 쌍으로 갖는 자료형이다.

       // 키(key)	값(value)
       // people	사람
       // baseball	야구

        // HashMap
        // put
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        // get
        // get 메서드는 key에 해당하는 value를 얻을 때 사용한다.
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("people", "사람");
        map2.put("baseball", "야구");
        System.out.println(map2.get("people")); // "사람" 출력

        // containsKey
        // containsKey 메서드는 맵에 해당 key가 있는지를 참(true) 또는 거짓(false)으로 리턴한다.
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("people", "사람");
        map3.put("baseball", "야구");
        System.out.println(map3.containsKey("people"));  // true 출력

        // remove
        // remove 메서드는 맵의 항목을 삭제하는 메서드로, 해당 key의 항목을 삭제한 후 value 값을 리턴한다.
        HashMap<String, String> map4 = new HashMap<>();
        map4.put("people", "사람");
        map4.put("baseball", "야구");
        System.out.println(map4.remove("people"));  // "사람" 출력

        // size
        // size 메서드는 맵 요소의 개수를 리턴한다.
        System.out.println(map4.size()); // 1

        // keySet
        // keySet은 맵의 모든 key를 모아서 리턴한다.
        HashMap<String, String> map5 = new HashMap<>();
        map5.put("people", "사람");
        map5.put("baseball", "야구");
        System.out.println(map5.keySet());  // [baseball, people] 출력

        // keySet() 메서드
        // 맵의 모든 key를 모아서 집합 자료형으로 리턴한다.
        // 집합 자료형은 리스트 자료형으로 바꾸어 사용할 수도 있다.
        ArrayList<String> keyList = new ArrayList<>(map.keySet());

    }

}
