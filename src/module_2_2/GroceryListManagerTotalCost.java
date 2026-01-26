package module_2_2;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManagerTotalCost {
    private static Map<String, Double> groceryList = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Grocery List:");
        addItem("Plasma Fruit", 5.99);
        addItem("Cowplant Berry", 12.50);
        addItem("Insect Protein", 3.75);

        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            double cost = entry.getValue();
            System.out.println(item + ": " + cost);
        }

        System.out.printf("%nTotal cost: %.2f%n", calculateTotalCost());
    }

    public static void addItem(String item, double cost) {
        if (item == null || cost < 0) {
            System.out.println("Enter valid item name and price.");
            return;
        }

        groceryList.put(item, cost);
    }

    public static double calculateTotalCost() {
        double sum = 0.0;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            double cost = entry.getValue();
            sum += cost;
        }
        return sum;
    }
}

