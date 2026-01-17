package module_1_2;
import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in grams: ");
        int grams = Integer.parseInt(scanner.nextLine());

        double totalLuoti = grams / 13.28;

        int totalNaula = (int) (totalLuoti / 32);
        double luoti = totalLuoti - totalNaula * 32;

        int leiviska = totalNaula / 20;
        int naula = totalNaula - leiviska * 20;

        System.out.printf("%d grams is %d leiviskä, %d naula, and %.2f luoti", grams, leiviska, naula, luoti);
    }
}
