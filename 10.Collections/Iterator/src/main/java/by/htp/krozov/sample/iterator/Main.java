package by.htp.krozov.sample.iterator;

import java.util.Iterator;

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
