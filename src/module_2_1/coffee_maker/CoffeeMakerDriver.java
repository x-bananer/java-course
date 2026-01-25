package module_2_1.coffee_maker;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.pressOnOff();
        if (coffeeMaker.isOn()) {
            System.out.println("Coffee maker is on");
        } else {
            System.out.println("Coffee maker is off");
        }

        if (coffeeMaker.isOn()) {
            coffeeMaker.setType("espresso");
            coffeeMaker.setAmount(50);

            String currentType =  coffeeMaker.getType();
            int currentAmount = coffeeMaker.getAmount();

            System.out.println("Coffee type is " + currentType);
            System.out.println("Coffee amount is " + currentAmount + "ml");
        }

        coffeeMaker.pressOnOff();
        if (coffeeMaker.isOn()) {
            System.out.println("Coffee maker is on");
        } else {
            System.out.println("Coffee maker is off");
        }
    }
}
