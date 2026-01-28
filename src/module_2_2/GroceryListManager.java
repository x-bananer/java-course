package module_2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private static ArrayList<String> groceryList = new ArrayList<>();
    private static Map<String, Double> prices = new HashMap<>();
    private static Map<String, String> categories = new HashMap<>();
    private static Map<String, Integer> quantities = new HashMap<>();

    public static void removeItem(String item) {
        groceryList.remove(item);
    }

    public static void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public static boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void addItem(String item, double cost, String category, int quantity) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        }

        prices.put(item, cost);
        categories.put(item, category);
        quantities.put(item, quantity);
    }

    public static double calculateTotalCost() {
        double sum = 0.0;
        for (String item : prices.keySet()) {
            int quantity = quantities.get(item);
            sum += prices.get(item) * quantity;
        }
        return sum;
    }

    public static void displayByCategory(String category) {
        System.out.println("Category: " + category);
        for (String item : categories.keySet()) {
            if (categories.get(item).equals(category)) {
                System.out.println(item + ": " + prices.get(item) + " ₸");
            }
        }
    }

    public static void updateQuantity(String item, int newQuantity) {
        quantities.put(item, newQuantity);
    }

    public static void displayAvailableItems() {
        System.out.println("Available items:");
        for (String item : quantities.keySet()) {
            if (quantities.get(item) > 0) {
                System.out.println(item + " | " + quantities.get(item) + " pcs");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("2.2.1");
        addItem("Plasma Fruit", 0.0, "Uncategorized", 1);
        addItem("Cowplant Berry", 0.0, "Uncategorized", 1);
        addItem("Insect Milk", 0.0, "Uncategorized", 1);
        displayList();

        System.out.println("Check Cowplant Berry: " + checkItem("Cowplant Berry"));
        removeItem("Cowplant Berry");
        System.out.println("Remove Cowplant Berry!");
        displayList();

        System.out.println("\n2.2.2");
        addItem("Plasma Fruit", 1.20, "Uncategorized", 1);
        addItem("Cowplant Berry", 0.90, "Uncategorized", 1);
        System.out.println("Total cost: " + calculateTotalCost() + " ₸");

        System.out.println("\n2.2.3");
        addItem("Insect Milk", 1.80, "Dairy", 1);
        addItem("Subgalactic Cheese", 3.50, "Dairy", 1);
        displayByCategory("Dairy");

        System.out.println("\n2.2.4");
        addItem("Plasma Fruit", 1.20, "Fruits", 5);
        addItem("Cowplant Berry", 0.90, "Fruits", 3);
        addItem("Subgalactic Cheese", 3.50, "Dairy", 10);
        displayAvailableItems();

        System.out.println("\n2.2.5");
        System.out.println("Total cost with quantity: " + calculateTotalCost() + " ₸");

        System.out.println("\nUpdate quantity!\n");

        updateQuantity("Plasma Fruit", 2);
        addItem("Cowplant Berry", 0.90, "Fruits", 0);
        updateQuantity("Subgalactic Cheese", 7);
        displayAvailableItems();

        System.out.println("Total cost with quantity: " + calculateTotalCost() + " ₸");
    }
}