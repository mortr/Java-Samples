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
        for (double[] row : array) {
            for (int i = 0, lastI = row.length - 1; i < row.length; i++) {
                System.out.print(row[i]);
                if (i != lastI) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printFormat(double[][] array) {
        for (double[] row : array) {
            for (int i = 0, lastI = row.length - 1; i < row.length; i++) {
                System.out.printf("%6.2f", row[i]);
                if (i != lastI) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
