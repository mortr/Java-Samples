package by.htp.krozov.sample.javabasics;

public class FibonachiForMain {

    /**
     * Print all items of fibonachi sequence that less that described value.
     * <p/>
     * Output format is:
     * fib[1] = 1;
     * fib[2] = 2;
     * fib[3] = 3;
     * fib[4] = 5;
     * ...
     */
    public static void main(String[] args) {
        final int mavValue = Integer.parseInt(args[0]); // Parse mav value set by user from string to int value

        System.out.println("Max value is " + mavValue);

        if (mavValue < 1) { // Impossible compute item for non positive mav value
            System.out.println("Limit must be positive value. You limit is " + mavValue + '.');
        } else {
            if (mavValue >= 1) {
                System.out.println("fib[1] = 1");
            }

            if (mavValue >= 2) {
                System.out.println("fib[2] = 2");
            }

            for (
                    int itemNumber = 3, previousItem = 1, currentItem = 2;
                    currentItem + previousItem <= mavValue;
                    ++itemNumber
                    ) {

                int temp = previousItem;
                previousItem = currentItem;
                currentItem += temp;
                System.out.println("fib[" + itemNumber + "] = " + currentItem);
            }
        }

    }
}
