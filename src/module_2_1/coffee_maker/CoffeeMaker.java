package module_2_1.coffee_maker;

public class CoffeeMaker {
    private String type;
    private int amount;

    /*
    "static" tällä tarkoittaa, että arvoa ei luoda jokaiselle CoffeeMaker-oliolle erikseen.
    Se luodaan ja tallennetaan muistiin vain kerran, ja siitä on vain yksi kopio muistissa,
    ja kaikki CoffeeMaker-oliot käyttävät sitä samaa arvoa.
    */
    private static final String[] TYPES = new String[]{"normal", "espresso"};
    private static final int MIN_AMOUNT = 10;
    private static final int MAX_AMOUNT = 80;

    private boolean isOn = false;

    // Konstruktori. Oletusasetukset ovat "normal" tyypille ja minimimäärä määrälle
    public CoffeeMaker () {
        this.type = TYPES[0];
        this.amount = MIN_AMOUNT;
    }

    // Asettaa kahvimäärän (kun laite on päällä)
    public void setAmount(int amount) {
        if (!isOn) return;

        // Tarkistaa, onko annettu kahvimäärä sallittu
        if (amount < MIN_AMOUNT) {
            this.amount = MIN_AMOUNT;
        } else if (amount > MAX_AMOUNT) {
            this.amount = MAX_AMOUNT;
        } else {
            this.amount = amount;
        }
    }

    // Asettaa kahvityypin (kun laite on päällä)
    public void setType(String type) {
        if (!isOn) return;

        // Tarkistaa, onko annettu kahvityyppi sallittu
        for (String t : TYPES) {
            if (t.equals(type)) {
                this.type = type;
                return;
            }
        }
    }

    // Palauttaa nykyisen kahvimäärän
    public int getAmount() {
        return amount;
    }

    // Palauttaa nykyisen kahvityypin
    public String getType() {
        return type;
    }

    // Kertoo, onko laite päällä
    public boolean isOn() {
        return isOn;
    }

    // Vaihtaa laitteen tilan (päällä tai pois päältä)
    public void pressOnOff() {
        isOn = !isOn;
    }
}
