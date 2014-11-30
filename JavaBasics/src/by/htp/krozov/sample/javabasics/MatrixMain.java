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

        for (double[] row : matrix) { // For each cycle that iterate matrix rows
            for (double rowItem : row) { // For each cycle that iterate row item
                System.out.printf("%6.2f", rowItem);    // Format output. Make only 2
                                                        // digit after point visible
                                                        //and digits occupy 6 character positions.
            }
            System.out.println();
        }
    }
}
