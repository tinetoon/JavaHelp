package Void;

public class Class {

    static int a;
    static int b;
    static int i;

    public static void main(String[] args) {
        aVoid();
        bVoid();
        sum(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("i = " + i);
    }

    private static void aVoid() {
        int a = 0;
    }

    private static void bVoid() {
        int b = 0;
    }

    private static void sum(int a, int b) {
        i = a + b;
    }

}
