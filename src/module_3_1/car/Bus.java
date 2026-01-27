package module_3_1.car;

public class Bus extends Car {
    private int passengers;

    public Bus(String typeName) {
        super(typeName);
        passengers = 0;
    }

    public void passengerEnter() {
        passengers++;
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
        }
    }

    public int getPassengers() {
        return passengers;
    }
}
