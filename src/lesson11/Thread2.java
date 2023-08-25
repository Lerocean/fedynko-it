package lesson11;

public class Thread2 extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Нечетное число: " + i);
            }
        }
    }