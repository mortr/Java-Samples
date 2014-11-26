package by.htp.krozov.sample.method;

import java.util.Random;

public class MethodMain {

    public static void main(String[] args) {
        int[][] array = new int[5][3];
        fillRandom(array);
        print(array);
    }

    public static void fillRandom(int[][] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt();
            }
        }
    }

    public static void print(int[][] array) {
        for (int row = 0, lastRow = array.length - 1; row < array.length; row++) {
            for (
                    int column = 0, lastColumn = array[row].length - 1;
                    column < array[row].length;
                    column++
                    ) {
                System.out.print(array[row][column]);

                if (column != lastColumn) {
                    System.out.print(' ');
                }
            }

            if (row != lastRow) {
                System.out.println();
            }
        }
    }
}
