package module_5_1;

import java.util.Random;

public class ParallelNumberSummation {
    static class SumJob implements Runnable {
        int[] numbers;
        int start;
        int end;
        long sum = 0;

        SumJob(int[] numbers, int start, int end) {
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

        int cores = Runtime.getRuntime().availableProcessors();

        Thread[] threads = new Thread[cores];
        SumJob[] jobs = new SumJob[cores];

        int numbersPerThread = count / cores;

        for (int i = 0; i < cores; i++) {
            int start = i * numbersPerThread;
            int end = start + numbersPerThread;

            if (i == cores - 1) {
                end = count;
            }

            jobs[i] = new SumJob(numbers, start, end);
            threads[i] = new Thread(jobs[i]);
            threads[i].start();
        }

        long total = 0;

        for (int i = 0; i < cores; i++) {
            threads[i].join();
            total += jobs[i].sum;
        }

        System.out.println("Sum: " + total);
    }
}
