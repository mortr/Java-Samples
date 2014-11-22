package by.htp.krozov.sample.javabasics;

public class FibonachiWhileMain {

    public static void main(String[] args) {
        final int mavValue = Integer.parseInt(args[0]);

        System.out.println("Max value is " + mavValue);

        if (mavValue < 1) {
            System.out.println("Limit must be positive value. You limit is " + mavValue + '.');
        } else {
            if (mavValue >= 1) {
                System.out.println("fib[1] = 1");
            }

            if (mavValue >= 2) {
                System.out.println("fib[2] = 2");
            }

            int previousItem = 1;
            int currentItem = 2;
            int itemNumber = 3;
            while (currentItem + previousItem <= mavValue) {
                int oldFib2 = previousItem;
                previousItem = currentItem;
                currentItem += oldFib2;

                System.out.println("fib[" + itemNumber + "] = " + currentItem);

                itemNumber++;
            }
        }

    }
}
