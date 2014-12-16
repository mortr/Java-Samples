package by.htp.krozov.sample.generics;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("key", 1);

        Pair<? extends CharSequence, Serializable> pair2 = new Pair<String, Serializable>("key", 1);
        Pair<? super String, Serializable> pair3 = new Pair<CharSequence, Serializable>("key", 1);
    }
}
