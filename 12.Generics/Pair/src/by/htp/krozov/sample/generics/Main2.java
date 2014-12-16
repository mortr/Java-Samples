package by.htp.krozov.sample.generics;

import java.io.Serializable;

public class Main2 {

    public static void main(String[] args) {
        Pair2<String, Integer> pair = new Pair2<String, Integer>("key", 1);
        String key = (String) pair.getKey();
        // Not valid anymore
        Integer keyInt = (Integer) pair.getKey();
    }
}
