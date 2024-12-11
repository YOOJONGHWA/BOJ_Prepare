package solved;

import java.util.Scanner;

public class BOJ31403 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);

        int num = Integer.parseInt(strA+strB);
        int num2 = Integer.parseInt(strC);

        System.out.println(a + b - c);
        System.out.println(num - num2);


    }

}
