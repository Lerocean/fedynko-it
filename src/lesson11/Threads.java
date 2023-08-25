package lesson11;

public class Threads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printName("Поток 1", 10));
        Thread thread2 = new Thread(() -> printName("Поток 2", 10));

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }

    private static void printName(String threadName, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(threadName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
