package lesson11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class SumOfNums {
    private static final int N = 100;
    private static final int THREAD_COUNT = 4;
    private static final AtomicLong sum = new AtomicLong(0);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int threadId = i;
            executor.execute(() -> calculateSumOfNums(threadId));
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("Сумма квадратов первых " + N + " натуральных чисел: " + sum.get());
    }

    private static void calculateSumOfNums(int threadId) {
        for (int i = threadId + 1; i <= N; i += THREAD_COUNT) {
            long square = (long) i * i;
            sum.getAndAdd(square);
        }
    }
}

