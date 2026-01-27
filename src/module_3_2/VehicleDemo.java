package module_3_2;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car("Red");
        Vehicle motorcycle = new Motorcycle("Black");
        Vehicle bus = new Bus(40);

        Vehicle electricCar = new ElectricCar();
        Vehicle electricMotorcycle = new ElectricMotorcycle();

        car.start();
        car.stop();
        car.charge();
        System.out.println(car.getInfo());
        System.out.println("Fuel efficiency: " + car.calculateFuelEfficiency() + "\n");

        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        System.out.println(motorcycle.getInfo());
        System.out.println("Fuel efficiency: " + motorcycle.calculateFuelEfficiency() + "\n");

        bus.start();
        bus.stop();
        bus.charge();
        System.out.println(bus.getInfo());
        System.out.println("Fuel efficiency: " + bus.calculateFuelEfficiency() + "\n");

        electricCar.start();
        electricCar.stop();
        electricCar.charge();
        System.out.println(electricCar.getInfo());
        System.out.println("Fuel efficiency: " + electricCar.calculateFuelEfficiency() + "\n");

        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge();
        System.out.println(electricMotorcycle.getInfo());
        System.out.println("Fuel efficiency: " + electricMotorcycle.calculateFuelEfficiency() + "\n");
    }
}