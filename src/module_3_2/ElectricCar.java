package module_3_2;

public class ElectricCar extends AbstractVehicle {
    public ElectricCar() {
        super("Electric Car", "Electricity", 0.18);
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging...");
    }
}