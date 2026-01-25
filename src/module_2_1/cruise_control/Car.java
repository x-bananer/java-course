package module_2_1.cruise_control;

public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    
    private double cruiseControlTargetSpeed;
    private boolean isCruiseControlOn;
    private static final double MIN_CRUISE_CONTROL_SPEED = 10;
    private static final double MAX_CRUISE_CONTROL_SPEED = 80;

    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel = Math.max(0, gasolineLevel - 1);
        } else {
            speed = 0;
        }
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
                gasolineLevel = Math.max(0, gasolineLevel - 0.5);
            }
        } else {
            speed = 0;
        }
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }

    public boolean setCruiseControlSpeed(double selectedSpeed) {
        cruiseControlTargetSpeed = selectedSpeed;
        return true;
    }

    public double getCruiseControlSpeed() {
        return cruiseControlTargetSpeed;
    }

    public boolean turnCruiseControlOnOff() {

        // Jos CC on jo päällä, kytkeä sen pois
        if (isCruiseControlOn) {
            isCruiseControlOn = false;
            return true;
        }

        // Tarkistetaan ensin, onko valittu nopeus on sallittu
        boolean isSelectedSpeedValid =
                cruiseControlTargetSpeed >= MIN_CRUISE_CONTROL_SPEED
                && cruiseControlTargetSpeed <= MAX_CRUISE_CONTROL_SPEED;

        boolean hasGasoline = gasolineLevel > 0;

        // Ei voida käynnistää, jos nopeus ei ole sallittu tai bensaa ei ole
        if (!isSelectedSpeedValid || !hasGasoline) {
            isCruiseControlOn = false;
            return false;
        }

        // Auto säätää nopeuttaan kohti tavoitenopeutta
        while (speed != cruiseControlTargetSpeed) {
            if (speed < cruiseControlTargetSpeed) {
                accelerate();
            } else {
                decelerate(10);
            }

            // Jos bensa loppuu ennen tavoitenopeutta, toiminto epäonnistuu
            if (gasolineLevel <= 0) {
                isCruiseControlOn = false;
                return false;
            }
        }

        isCruiseControlOn = true;
        return true;
    }
}
