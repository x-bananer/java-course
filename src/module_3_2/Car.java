package module_3_2;

// 3.2.1
//public class Car implements Vehicle {
//    @Override
//    public void start() {
//        System.out.println("Car is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Car is stopping...");
//    }
//
//    @Override
//    public String getInfo() {
//        return "Car Information:\n Type: Car\n Fuel: Petrol\n Color: Red";
//    }
//}

// 3.2.2
public class Car extends AbstractVehicle {
    private String color;

    public Car(String color) {
        super("Car", "Petrol", 6.5);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nColor: " + color;
    }
}