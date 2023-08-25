package lesson11;

public class MainThread {
    private static final Object lock = new Object();
    private static int counter = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printNameAndNumber("Поток 1"));
        Thread thread2 = new Thread(() -> printNameAndNumber("Поток 2"));

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }

    private static void printNameAndNumber(String threadName) {
        synchronized (lock) {
            int threadNumber = counter++;
            for (int i = 1; i <= 10; i++) {
                while (threadNumber != counter - 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(threadName + ": число " + i);

                lock.notifyAll();
            }
        }
    }
}

