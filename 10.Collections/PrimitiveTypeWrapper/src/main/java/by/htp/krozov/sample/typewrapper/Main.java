package by.htp.krozov.sample.typewrapper;

/**
 * Created by krozov on 11.12.14.
 */
public class Main {
    public static void main(String[] args) {
        int ten = 10;
        Integer tenWrapper = ten; // auto boxing
//        Double tenDoubleWrapper = ten; // auto boxing not work

        int tenCopy = tenWrapper; // auto unboxing
        double doubleCopy = tenWrapper; // auto unboxing
    }
}
