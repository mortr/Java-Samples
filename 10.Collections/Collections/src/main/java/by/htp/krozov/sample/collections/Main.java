package by.htp.krozov.sample.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by krozov on 11.12.14.
 */
public class Main {
    public static void main(String[] args) {
        final String[] items = {
                "item1",
                "item1", // Duplicate first item
                "item2",
                "item3",
                "item5"
        };

        System.out.println("Try add items " + Arrays.toString(items) +
                                   " to different collection types.\n");

        System.out.println("Add item to List.");
        List<String> list = createList(items);
        System.out.println(list);
        System.out.println();

        System.out.println("Add item to Set.");
        Set<String> set = createSet(items);
        System.out.println(set);
        System.out.println();
    }

    private static List<String> createList(String... items) {
        List<String> list = new ArrayList<String>();
        for (String item : items) {
            list.add(item);
        }
        return list;
    }

    private static Set<String> createSet(String... items) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, items);
        return set;
    }
}
