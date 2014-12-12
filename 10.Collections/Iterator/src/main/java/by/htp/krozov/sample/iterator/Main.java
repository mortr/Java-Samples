package by.htp.krozov.sample.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by krozov on 11.12.14.
 */
public class Main {

    public static void main(String[] args) {
        //Create new vector.
        Vector vector = new Vector(10);

        //Every item is "i * i", where i is item index
        for (int i = 1; i <= vector.size(); i++) {
            vector.setItem(i, i * i);
        }

        System.out.println("Generated vector is " + vector);

        int sumForEach = sumForEach(vector);
        System.out.println("Vector items sum = " + sumForEach);
    }

    private static int getMaximum(Vector vector) {
        return Collections.max(vectorToList(vector));
    }

    private static int getMinimum(Vector vector) {
        return Collections.min(vectorToList(vector));
    }

    private static List<Integer> vectorToList(Vector vector) {
        List<Integer> list = new ArrayList<Integer>(vector.size());
        for (int value : vector) {
            list.add(value);
        }
        return list;
    }

    private static int sumWhile(Vector vector) {
        int sumWhile = 0;
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            sumWhile += iterator.next();
        }
        return sumWhile;
    }

    private static int sumForEach(Vector vector) {
        int itemsSum = 0;
        // Use iterator in for each
        for (Integer item : vector) {
            itemsSum += item;
        }
        return itemsSum;
    }
}
