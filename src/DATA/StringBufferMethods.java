package DATA;

public class StringBufferMethods {

    public static void main(String[] args) {

        //append

        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);  // "hello jump to java" 출력

        //insert
        //insert 메서드는 특정 위치에 원하는 문자열을 삽입할 수 있다.

        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0, "hello ");
        System.out.println(sb.toString());

        //substring
        //substring 메서드는 String 자료형의 substring 메서드와 동일하게 동작한다.


        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello jump to java");
        System.out.println(sb.substring(0, 4));// Hell 출렦

    }

}
