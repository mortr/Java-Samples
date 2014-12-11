package by.htp.krozov.sample.multithreading;

import java.util.Random;

/**
 * Created by krozov on 25.11.14.
 */
public class ThreadMain {
    private static int i;

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            private Random r = new Random(System.currentTimeMillis());

            @Override
            public void run() {
                for (int j = 0; j <= 20; j++) {
                    i += j;
                    try {
                        int pause = r.nextInt(2000);
                        Thread.sleep(pause);
                        System.out.printf("Thread sleep for %d ms", pause).println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("i=%d, j=%d", i, j).println();
                }
            }
        };

        Thread thread = new Thread(r);

        System.out.println("Before start thread");
        thread.start();

//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("After start thread");
    }
}
