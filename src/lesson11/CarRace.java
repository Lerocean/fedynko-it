package lesson11;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class CarRace {
    public static final int FINISH_DISTANCE = 150;
    static final AtomicBoolean raceFinished = new AtomicBoolean(false);

    public static void main(String[] args) {
        Car car1 = new Car("Машина 1");
        Car car2 = new Car("Машина 2");

        car1.start();
        car2.start();
    }

    static void declareWinner(String carName) {
        if (!raceFinished.getAndSet(true)) {
            System.out.println("Победитель: " + carName);
        }
    }
}

class Car extends Thread {
    private static final int MAX_SPEED = 5;

    private final String carName;
    private int distanceTraveled;

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (distanceTraveled < CarRace.FINISH_DISTANCE) {
            if (CarRace.raceFinished.get()) {
                break;
            }

            int speed = random.nextInt(MAX_SPEED) + 1;
            distanceTraveled += speed;
            System.out.println(carName + ": Проехала " + distanceTraveled + " метров");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (distanceTraveled >= CarRace.FINISH_DISTANCE) {
            CarRace.declareWinner(carName);
        }
    }
}
