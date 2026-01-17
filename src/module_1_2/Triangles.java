package module_1_2;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first leg: ");
        double firstLeg = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the length of the second leg: ");
        double secondLeg = Double.parseDouble(scanner.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));

        System.out.printf("The length of the hypotenuse: %.2f", hypotenuse);

    }
}
