package by.htp.krozov.sample.generics;

/**
* Created by krozov on 16.12.14.
*/
public class Pair<K, V extends Number> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
