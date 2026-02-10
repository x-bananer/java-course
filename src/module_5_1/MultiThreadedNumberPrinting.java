package module_5_1;

public class MultiThreadedNumberPrinting {
    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }

    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread odd = new OddThread();
        Thread even = new EvenThread();

        odd.start();
        even.start();

        odd.join();
        even.join();

        System.out.println("Printing complete.");
    }
}
