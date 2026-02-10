package module_5_1;

import java.util.Random;

public class ParallelNumberSummation {
    static class SumThread extends Thread {
        int[] numbers;
        int start;
        int end;
        long sum = 0;

        SumThread(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        public void run() {
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int count = 100000;
        int[] numbers = new int[count];

        Random randomNumsGenerator = new Random();

        for (int i = 0; i < count; i++) {
            numbers[i] = randomNumsGenerator.nextInt(10);
        }

        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        SumThread[] threads = new SumThread[numberOfThreads];

        int numbersPerThread = count / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * numbersPerThread;
            int end = start + numbersPerThread;

            if (i == numberOfThreads - 1) {
                end = count;
            }

            threads[i] = new SumThread(numbers, start, end);

            threads[i].start();
        }

        long total = 0;

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
            total += threads[i].sum;
        }

        System.out.println("Sum: " + total);
    }
}
