package module_3_2;

// 3.2.1
//public class Motorcycle implements Vehicle {
//    @Override
//    public void start() {
//        System.out.println("Motorcycle is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Motorcycle is stopping...");
//    }
//
//    @Override
//    public String getInfo() {
//        return "Motorcycle Information:\n Type: Motorcycle\n Fuel: Gasoline\n Color: Black";
//    }
//}

// 3.2.2
public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String color) {
        super("Motorcycle", "Gasoline", 4.0);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nColor: " + color;
    }
}