package module_2_2;

import java.util.ArrayList;

public class GroceryListManager {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Grocery List:");
        addItem("Plasma Fruit");
        addItem("Cowplant Berry");
        addItem("Insect Protein");
        addItem("Milk");

        displayList();

        String testItem = "Cowplant Berry";

        System.out.printf("\nIs \"%s\" in the grocery list? %b\n", testItem, checkItem(testItem));

        System.out.printf("\nRemoving \"%s\" from the list...\n", testItem);
        removeItem(testItem);

        System.out.println("\nUpdated Grocery List:");
        displayList();
    }

    public static void addItem(String item) {
        if (item == null) {
            System.out.println("Enter valid item name.");
            return;
        }

        if (groceryList.contains(item)) {
            System.out.println("Item already exists.");
            return;
        }

        groceryList.add(item);
    }

    public static void removeItem(String item) {
        if (!groceryList.contains(item)) {
            System.out.println("Item not found.");
            return;
        }
        groceryList.remove(item);
    }

    public static void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    public static boolean checkItem(String item) {
        return groceryList.contains(item);
    }
}
