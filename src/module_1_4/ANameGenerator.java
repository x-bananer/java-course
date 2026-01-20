/**
 Write a program that generates random names by combining
 first and last names from hard-coded name arrays.
 */

package module_1_4;

import java.util.Scanner;

public class ANameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {"Marsha", "Chip", "Neil", "Paige", "Anita", "Art", "Story", "Al", "Cliff", "Clair"};
        String[] lastNames = {"Mellow", "Munk", "Down", "Turner", "Bath", "Major", "Teller", "O’Vera", "Hanger", "Annette"};

        System.out.print("How many random names should the program generate: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String firstName = firstNames[(int) (Math.random() * firstNames.length)];
            String lastName = lastNames[(int) (Math.random() * lastNames.length)];
            System.out.println(firstName + " " + lastName);
        }
    }
}
