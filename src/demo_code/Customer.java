package demo_code;

public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int customerCounter = 1;

    public Customer() {
        this.id = customerCounter++;
    }

    public int getId() {
        return id;
    }

    public void enterTime() {
        startTime = System.currentTimeMillis();
    }

    public void leaveTime() {
        startTime = System.currentTimeMillis();
    }

    public int timeElapsed() {
        return (int)(endTime - startTime) / 1000;
    }

    public static void main(String[] args) {
       Customer c = new Customer();
        Customer c2 = new Customer();

        c.enterTime();

    }
}
