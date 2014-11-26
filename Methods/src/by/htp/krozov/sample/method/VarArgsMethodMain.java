package by.htp.krozov.sample.method;

/**
 * Created by krozov on 26.11.14.
 */
public class VarArgsMethodMain {

    public static void main(String... args) {
        int sum1 = sum(1, 2);
        double sum2 = sum(1.0, 2.0, 5.1, 4.3);
    }

    public static int sum(int a, int b, int... addItems) {
        int sum = a + b;
        if (addItems.length > 0) {
            for (int item : addItems) {
                sum += item;
            }
        }
        return sum;
    }

    public static double sum(double a, double b, double... addItems) {
        double sum = a + b;
        if (addItems.length > 0) {
            for (double item : addItems) {
                sum += item;
            }
        }
        return sum;
    }
}
