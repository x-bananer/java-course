package module_3_2;

public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", 0.12);
    }

    @Override
    public void charge() {
        System.out.println("Electric motorcycle is charging...");
    }
}
