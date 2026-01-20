/**
 Write a program that takes an array of integers as input
 from the user and finds the subarray with the maximum sum.
 */

package module_1_4;

import java.util.Scanner;

public class FindingTheMaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size =  scanner.nextInt();

        System.out.println("Enter the integers into the array:");
        int[] numbers = new int[size];

        // Täytetään taulukko käyttäjän antamilla luvuilla
        for (int i = 0; i < size; i++) {
            int counter = i + 1;
            System.out.println("Enter integer " + counter + ": ");
            int number =  scanner.nextInt();

            numbers[i] = number;
        }

        // Aluksi oletetaan, että suurin summa on taulukon ensimmäinen arvo
        int maxSum = numbers[0];

        // Nämä muuttujat muistavat, mistä ja mihin asti paras osataulukko menee
        int from = 0;
        int to = 0;

        // Tämä loop valitsee, mistä subarray alkaa
        for (int start = 0; start < numbers.length; start++) {

            // Tämä loop lisää subarrayyn yhden alkion kerrallaan, laajentaa subarraya oikealle
            for (int end = start; end < numbers.length; end++) {
                int sum = 0;

                /* Tämä loop lasketa nykyisen subarrayn alkioiden summa
                eli summaa kaikki arvot indeksistä start indeksiin end */
                for (int i = start; i <= end; i++) {
                    sum += numbers[i];
                }

                /* Jos löydetty summa on suurempi kuin aiempi maksimi,
                tallennetaan uusi maksimi ja sen rajat */
                if (sum > maxSum) {
                    maxSum = sum;
                    from = start;
                    to = end;
                }
            }
        }

        // Tulostetaan suurin löydetty summa
        System.out.println("Maximum sum: " + maxSum);

        // Näytetään käyttäjälle indeksit alkaen 1:stä
        System.out.println("Indices: " + (from + 1) + " - " + (to + 1));
    }
}
