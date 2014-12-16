package by.htp.krozov.sample.genericclass;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("key", 1);
        String key = pair.getKey();
    }
}
