/**
Write a program that prompts the user to enter a binary number (composed of 0s and 1s) and converts it to decimal.
Display the decimal equivalent on the console.
*/

package module_1_3;
import java.util.Scanner;

public class BinaryValues {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter binary number: ");

        String binaryNumber = scanner.nextLine();
        int binaryNumberLength = binaryNumber.length();
        int decimalNumber = 0;

        for (int i = 1; i <= binaryNumberLength; i++) {
            int currentItemPower = binaryNumberLength - i;
            int currentItemIndex = i - 1;

            /*
            charAt() palauttaa merkin (char) ('0' tai '1'), ei kokonaislukua (int).
            ASCII/Unicode:n mukaan, merkin '0' numeerinen arvo on 48 ja merkin '1' arvo on 49.
            Vähentämällä merkki '0' saadaan vastaava kokonaislukuarvo 0 tai 1.
            */

            int currentItemValue = binaryNumber.charAt(currentItemIndex) - '0';


            int poweredItem = (int) Math.pow(2, currentItemPower);
            // Sama voidaan tehdä bittisiirrolla: 1 << currentItemPower

            decimalNumber += poweredItem * currentItemValue;
        }

         System.out.printf("Your decimal number is: %d", decimalNumber);
    }
}
