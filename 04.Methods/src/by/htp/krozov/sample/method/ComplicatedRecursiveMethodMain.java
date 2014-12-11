package by.htp.krozov.sample.method;

import java.util.Random;

public class ComplicatedRecursiveMethodMain {

    public static void main(String[] args) {
        int n = new Random().nextInt(16)+ 15;
        System.out.printf("Target value for %d = %,d", n, valueA(n))
                .println();
    }

    public static int valueA(int n) {
        if (n <= 0) {
            return 0;
        }
        return valueB(n - 2) * 2;
    }

    public static int valueB(int n) {
        if (n <= 0) {
            return 0;
        }
        return valueA(n - 1) * n - 5;
    }
}
