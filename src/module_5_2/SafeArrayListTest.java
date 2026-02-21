package module_5_2;

public class SafeArrayListTest {

    static class A implements Runnable {
        private final SafeArrayList list;

        A(SafeArrayList list) {
            this.list = list;
        }

        public void run() {
            System.out.println("A start");

            list.add("A1");
            System.out.println("A added A1, size: " + list.size());

            list.add("A2");
            System.out.println("A added A2, size: " + list.size());

            list.remove("B1");
            System.out.println("A removed B1, size: " + list.size());

            System.out.println("A end");
        }
    }

    static class B implements Runnable {
        private final SafeArrayList list;

        B(SafeArrayList list) {
            this.list = list;
        }

        public void run() {
            System.out.println("B start");

            list.add("B1");
            System.out.println("B added B1, size: " + list.size());

            list.add("B2");
            System.out.println("B added B2, size: " + list.size());

            list.remove("A1");
            System.out.println("B removed A1, size: " + list.size());

            System.out.println("B end");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SafeArrayList list = new SafeArrayList();

        Thread t1 = new Thread(new A(list));
        Thread t2 = new Thread(new B(list));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Size: " + list.size());
    }
}
