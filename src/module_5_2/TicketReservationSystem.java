package module_5_2;

public class TicketReservationSystem {
    static int seats = 10;

    static synchronized boolean reserve(int count) {
        if (seats >= count) {
            seats -= count;
            return true;
        } else {
            return false;
        }
    }

    static class Customer extends Thread {
        int id;
        int request;

        Customer(int id, int request) {
            this.id = id;
            this.request = request;
        }

        public void run() {
            boolean success = reserve(request);
            if (success) {
                System.out.println("Customer " + id + " reserved " + request + " tickets.");
            } else {
                System.out.println("Customer " + id + " couldn't reserve " + request + " tickets.");
            }
        }
    }

    public static void main(String[] args) {
        Customer[] customers = new Customer[15];

        for (int i = 0; i < customers.length; i++) {
            int request = 1 + (int) (Math.random() * seats);

            customers[i] = new Customer(i + 1, request);
            customers[i].start();
        }

        try {
            for (Customer customer : customers) {
                customer.join();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
