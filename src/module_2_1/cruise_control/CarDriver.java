package module_2_1.cruise_control;

public class CarDriver {

    /*
    Why to modify CarDriver first?
    Koska se on yksi tapa kehittää ohjelmistoa, nimenomaan kirjoittamalla user storyja.
    Meidän tapauksessa autonkuljettaja on käyttäjä, ja aluksi on hyvä kuvata,
    kuka tekee mitä ja mikä hänen tavoitteensa on. Ohjelmoijalle tämä tarkoittaa,
    että hän voi aloittaa metodeista ja siirtyä sen jälkeen muuttujien määrittelyyn.
     */

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        boolean speedSet = myCar.setCruiseControlSpeed(30);

        boolean isSuccess = false;
        if (speedSet) {
            isSuccess = myCar.turnCruiseControlOnOff();
        }

        if (!isSuccess) {
            System.out.println("Reaching the target speed is not possible, cruise control was turned off");
        } else {
            System.out.println("Cruise control turned on at speed " + myCar.getCruiseControlSpeed());
        }
    }
}