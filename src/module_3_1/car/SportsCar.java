package module_3_1.car;

public class SportsCar extends Car {
    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        super.accelerate();
        super.accelerate();
    }

    @Override
    void decelerate(int amount) {
        super.decelerate(amount * 5);
    }
}