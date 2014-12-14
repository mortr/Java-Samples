package by.htp.krozov.sample.stringformat;

/**
 * Created by krozov on 14.12.14.
 */
public class Main {
    private static final double[][] MATRIX = {
            {21.010, 30.01, 001.12},
            {-11.31, 30.041, 1.12},
            {01.47, 17.821, -0.12},
    };

    public static void main(String[] args) {
        System.out.println("Print matrix without format:");
        print(MATRIX);
        System.out.println();
        System.out.println("Print matrix with format:");
        printFormat(MATRIX);
    }

    private static void print(double[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0, lastColumn = array[row].length - 1;
                 column < array[row].length;
                 column++) {

                System.out.print(array[row][column]);
                if (column != lastColumn) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printFormat(double[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0, lastColumn = array[row].length - 1;
                 column < array[row].length;
                 column++) {

                System.out.printf("%6.2f", array[row][column]);
                if (column != lastColumn) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
