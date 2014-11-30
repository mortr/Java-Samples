package by.htp.krozov.sample.multithreading;

import java.util.Random;

public class RaceConditionMain {
    private static int i;

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            private Random r = new Random(System.currentTimeMillis());

            @Override
            public void run() {
                for (int j = 1; j <= 20; j++) {
                    i += j;
                    System.out.printf("Thread '%s' work: i=%d, j=%d",
                                      Thread.currentThread().getName(), i, j)
                            .println();
                }
            }
        };

        Thread thread1 = new Thread(r, "Thread 1");
        Thread thread2 = new Thread(r, "Thread 2");
        Thread thread3 = new Thread(r, "Thread 3");

        thread2.start();
        thread1.start();
        thread3.start();
    }
}
