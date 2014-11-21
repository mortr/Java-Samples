package by.htp.krozov.sample.javabasics;

import java.util.Arrays;
import java.util.Random;

public class VectorMain {

    public static void main(String[] args) {
        int[] vector1 = {0x12, -3, (int) 10e1};
        int[] vector2 = {1, 3, 5};

        // Сумма двух векторов

        if (vector1.length == vector2.length) {  // проверяем размер
            int[] vectorSum = new int[vector1.length];
            for (int i = 0; i < vectorSum.length; i++) {
                vectorSum[i] = vector1[i] + vector2[i];
            }

            System.out.println(Arrays.toString(vector1) + " + " + Arrays.toString(vector2) +
                                       " = " + Arrays.toString(vectorSum) + "\n");
        } else {
            System.out.println("Can't compute sum." +
                                       "Vector has different sizes:" +
                                       "\"" + vector1.length + "\"" +
                                       " and " +
                                       "\"" + vector2.length + "\"" +
                                       '.');
        }

        // Генерация случайного числа
        Random r = new Random();
        double[] scaledVector = new double[vector1.length];
        // r.nextDouble() генерирует число от 0 до 1
        // r.nextInt(10) генерирует число от 0 до 10 (не включая)
        double scale = r.nextDouble() * r.nextInt(10);
        for (int i = 0; i < vector1.length; i++) {
            scaledVector[i] = vector1[i] * scale;
        }

        System.out.println(Arrays.toString(vector1) + " * " + scale
                                   + " = " + Arrays.toString(scaledVector) + "\n");

        // Cкалярное произведение 2 векторов
        if (vector1.length == vector2.length) {  // проверяем размер
            int result = 0;
            for (int i = 0; i < vector1.length; i++) {
                if (vector1[i] == 0 || vector2[i] == 0) {
                    continue;
                } else {
                    result += vector1[i] * vector2[i];
                }
            }

            System.out.println(Arrays.toString(vector1) + " * " + Arrays.toString(vector2) +
                                       " = " + result + "\n");
        } else {
            System.out.println("Can't compute scalar multiplication." +
                                       "Vector has different sizes:" +
                                       "\"" + vector1.length + "\"" +
                                       " and " +
                                       "\"" + vector2.length + "\"" +
                                       '.');
        }
    }
}
