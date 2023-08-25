package lesson11;

public class FirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Первый поток: " + i);
            }
        }
    }
