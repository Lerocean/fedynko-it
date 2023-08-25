package lesson11;

public class Thread1 extends Thread {
        @Override
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Четное число: " + i);
            }
        }
}
