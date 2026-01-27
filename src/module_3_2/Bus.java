package module_3_2;

// 3.2.1
//public class Bus implements Vehicle {
//    @Override
//    public void start() {
//        System.out.println("Bus is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Bus is stopping...");
//    }
//
//    @Override
//    public String getInfo() {
//        return "Bus Information:\n Type: Bus\n Fuel: Diesel\n Capacity: 40 passengers";
//    }
//}

// 3.2.2
public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(int capacity) {
        super("Bus", "Diesel", 15.0);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCapacity: " + capacity + " passengers";
    }
}
