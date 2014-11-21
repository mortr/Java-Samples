package by.htp.krozov.sample.javabasics;

public class FibonachiForMain {

    public static void main(String[] args) {
        final int mavValue = Integer.parseInt(args[0]);

        if (mavValue < 1) {
            System.out.println("Limit must be positive value. You limit is " + mavValue + '.');
        } else {
            if (mavValue >= 1) {
                System.out.println("fib[1] = 1");
            }

            if (mavValue >= 2) {
                System.out.println("fib[2] = 2");
            }

            if (mavValue >= 3) {
                for (
                        int itemNumber = 3, previousItem = 2, currentItem = 3;
                        currentItem <= mavValue;
                        ++itemNumber
                        ) {

                    System.out.println("fib[" + itemNumber + "] = " + currentItem);
                    int oldFib2 = previousItem;
                    previousItem = currentItem;
                    currentItem += oldFib2;
                }
            }
        }

    }
}
