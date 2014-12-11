package by.htp.krozov.sample.map;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by krozov on 11.12.14.
 */
public class Main {
    public static void main(String[] args) {
        //Container for input items
        Collection<Pair<Integer, String>> items = new ArrayList<>();

        Map<Integer, String> indexStringMap = new HashMap<>(0);
        //Add all numbers that multiples by 100 from 100 to 1000. Key == value
        for (int i = 100; i <= 1000; i += 100) {
            String value = String.valueOf(i);
            items.add(new Pair<>(i, value));
            indexStringMap.put(i, value);
        }

        System.out.println("Map keys:");
        Set<Integer> keys = indexStringMap.keySet();
        System.out.println(keys);
        System.out.println();

        System.out.println("Map values:");
        Collection<String> values = indexStringMap.values();
        System.out.println(values);
        System.out.println();

        System.out.println("Map entries:");
        Set<Map.Entry<Integer, String>> entries = indexStringMap.entrySet();
        System.out.println(entries);
        System.out.println();

    }
}
