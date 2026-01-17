package module_1_2;
import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("The temperature in Celsius: %.1f", celsius);
    }
}
