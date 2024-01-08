package DATA;

public class StringPratice {

    public static void main(String[] args) {

        String str = "Hello, World!";
        int length = str.length();
        System.out.println("문자열의 길이: " + length);

        String str1 = "Hello";
        String str2 = "World";
        if (str1.equals(str2)) {
            System.out.println("두 문자열은 같습니다.");
        } else {
            System.out.println("두 문자열은 다릅니다.");
        }

        String str3 = "Hello";
        char firstChar = str3.charAt(0);
        System.out.println("첫 번째 문자: " + firstChar);

        String str4 = "Hello";
        char firstChar4 = str4.charAt(0);
        System.out.println("첫 번째 문자: " + firstChar4);

        String str5 = "Hello, World!";
        String substring = str5.substring(7, 12);
        System.out.println("부분 문자열: " + substring);

        String str6 = "123";
        int num = Integer.parseInt(str6);
        System.out.println("정수로 변환: " + num);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("전체 이름: " + fullName);



    }

}
