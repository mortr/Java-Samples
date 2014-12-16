package by.htp.krozov.sample.genericmethod;

import java.util.Arrays;

/**
 * Created by krozov on 16.12.14.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] values = {1, 5, 10};
        System.out.printf("Is array %s less than %d = %b",
                          Arrays.toString(values), 20, isLess(values, 20));
        System.out.println();

        System.out.printf("Is array %s less than %d = %b",
                          Arrays.toString(values), 7, isLess(values, 7));
        System.out.println();

        Double[] nullArray = null;
        System.out.printf("Is array %s empty array? %b", nullArray, isEmpty(nullArray));
        System.out.println();

        System.out.printf("Is array %s empty array? %b", Arrays.toString(values), isEmpty(values));
    }

    public static <T extends Comparable<T>> boolean isLess(T[] array, T value) {
        for (T item : array) {
            if (item.compareTo(value) >= 0) {
                return false;
            }
        }
        return true;
    }

    public static <E> boolean isEmpty(E[] array) {
        return array == null || array.length == 0;
    }
}
