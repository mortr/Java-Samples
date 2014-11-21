package by.htp.krozov.sample.javabasics;

public class AbcForMain {

    public static void main(String[] args) {
        int charInLine = 1;
        for (char currentChar = 'a'; currentChar != 'z'; currentChar++, charInLine++) {
            for (int symbolIndex = 0; symbolIndex < charInLine; symbolIndex++) {
                System.out.print(currentChar);
            }
            System.out.println();
        }
    }
}
