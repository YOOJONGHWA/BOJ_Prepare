package codeUp;

public class gugudan {
    public static void main(String[] args) {
        printGugudan();
    }

    public static void printGugudan() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
