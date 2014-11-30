package by.htp.kirich1409.sample.scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = -1;
        do {
            if (sc.hasNextInt()) {
                count = sc.nextInt();
            } else {
                sc.next();
            }
        } while (count <= 0);
    }
}
