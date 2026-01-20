/**
 Write a program that takes an array of integers as input
 from the user and removes all the duplicate numbers from it.
 */

package module_1_4;

import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the integers into the array:");
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] noDublicatesNumbers = new int[size];

        // Tämä muuttuja kertoo, mihin asti uusi taulukko (array) on oikeasti käytössä
        int usedLength = 0;

        // Tämä loop käydä luvut läpi yksi kerrallaan
        for (int i = 0; i < size; i++) {
            int number = numbers[i];
            boolean isNumberPresented = false;

            // Tämä loop tarkistaa, onko tämä luku jo aiemmin lisätty
            for (int j = 0; j < usedLength; j++) {
                if (noDublicatesNumbers[j] == number) {
                    isNumberPresented = true;
                    break;
                }
            }

            // Jos lukua ei ole vielä taulukossa, lisätään sitä uuteen taulukkoon
            if (!isNumberPresented) {
                noDublicatesNumbers[usedLength] = number;
                usedLength++;
            }
        }

        System.out.println("The array without duplicates:");

        // Tulostetaan vain se osa taulukosta, johon lisättiin arvoja
        for (int i = 0; i < usedLength; i++) {
            System.out.print(noDublicatesNumbers[i] + " ");
        }
    }
}
