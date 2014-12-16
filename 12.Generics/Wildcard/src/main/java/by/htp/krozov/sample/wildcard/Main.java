package by.htp.krozov.sample.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krozov on 16.12.14.
 */
public class Main {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<Double>(3);
        doubles.add(1.);
        doubles.add(12.);
        doubles.add(0.);
        System.out.printf("Sum of %s = %.2f%n", doubles, sum(doubles));

        List<Number> numbers = new ArrayList<Number>(3);
        numbers.add(1);
        numbers.add(new Byte((byte) 15));
        numbers.add(1.0);
        System.out.printf("Sum of %s = %.2f%n", numbers, sum(numbers));

        List<Number> objects = new ArrayList<Number>(11);
        fill(objects, 30, 40);
        System.out.println(objects);

        print(objects);
        System.out.println();
    }

    // Upper bounded wildcard
    public static double sum(List<? extends Number> numbers) {
        double sum = 0.;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Lower bounded wildcard
    public static void fill(List<? super Integer> list, int start, int end) {
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
    }

    // Unbounded wildcard
    public static void print(List<?> list){
        System.out.print('[');
        for (int i = 0, cnt = list.size(); i < cnt; i++) {
            System.out.printf("[%d] = %s, ", i, list.get(i));
        }
        System.out.print(']');
    }
}
