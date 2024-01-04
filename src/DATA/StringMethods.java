package DATA;

public class StringMethods {

    public static void main(String[] args) {

       // 문자열 내장 메서드

       // equals
       // equals 메서드는 문자열 2개가 같은지를 비교하여 결괏값을 리턴한다.

        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b)); // false 출력
        System.out.println(a.equals(c)); // true 출력

        // indexOf
        // indexOf는 문자열에서 특정 문자열이 시작되는 위치(인덱스값)를 리턴한다.

        String d = "Hello Java";
        System.out.println(d.indexOf("Java"));  // 6 출력

        // contains
        // contains 메서드는 문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴한다.

        String e = "Hello Java";
        System.out.println(e.contains("Java"));  // true 출력

        // charAt
        // charAt 메서드는 문자열에서 특정 위치의 문자를 리턴한다.

        String f = "Hello Java";
        System.out.println(f.charAt(6));  // "J" 출력

        // replaceAll
        // replaceAll 메서드는 문자열에서 특정 문자열을 다른 문자열로 바꿀 때 사용한다.

        String g = "Hello Java";
        System.out.println(g.replaceAll("Java", "World"));  // Hello World 출력

        // substring
        // substring 메서드는 문자열에서 특정 문자열을 뽑아낼 때 사용한다.

        String h = "Hello Java";
        System.out.println(h.substring(0, 4));  // Hell 출력

        // toUpperCase
        // toUpperCase 메서드는 문자열을 모두 대문자로 변경할 때 사용한다.

        String i = "Hello Java";
        System.out.println(i.toUpperCase());  // HELLO JAVA 출력

        // split
        // split 메서드는 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴한다.

        String j = "a:b:c:d";
        String[] result = j.split(":");  // result는 {"a", "b", "c", "d"}

    }
}
