package lesson11;

public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Второй поток: " + i);
        }
    }
}
