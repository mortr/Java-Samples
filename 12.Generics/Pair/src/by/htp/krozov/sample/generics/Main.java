package by.htp.krozov.sample.generics;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        Pair pair = new Pair("key", 1);
        String key = (String) pair.getKey();
        Integer keyInt = (Integer) pair.getKey();
    }
}
