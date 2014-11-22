package by.htp.krozov.sample.javabasics;

import java.util.Random;

/**
 * Created by krozov on 22.11.14.
 */
public class MatrixMain {

    public static void main(String[] args) {
        Random r = new Random();
        final int matrixSize = r.nextInt(10);

        double[][] matrix = new double[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = r.nextDouble() * r.nextInt(10);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("%6.2f", matrix[row][column]);
            }
            System.out.println();
        }
    }
}
