package module_2_1;

public class ModifiedCar {
    private double speed;
    private double gasolineLevel;
    private String typeName;

    public ModifiedCar(String typeName) {
        /*
            Ennen: nopeus ja bensiinimäärä asetettiin tässä erikseen.
            speed = 0; gasolineLevel = 0;
            this.typeName = typeName;
        */

        /*
            Nyt: käyttämme toista luokan konstruktoria. Ei pakollista, mutta aika siisti ja selkeä.
            Sana "this" viittaa instansiin, kutsuu toista konstruktoria ja antaa sille arvo typeName, ja arvot 0 ja 0 as default for gasolineLevel and speed
        */
        this(typeName, 0, 0);
    }

    /*
        Muutokset ovat täällä ↓, lisätty uusi konstruktori, jossa on uusia parametreja
     */
    public ModifiedCar(String typeName, double gasolineLevel, double speed) {
        this.speed = speed;
        this.gasolineLevel = gasolineLevel;
        this.typeName = typeName;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
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
}
