/**
    Write a program that prompts the user to enter the coefficients of a quadratic equation (ax^2 + bx + c = 0)
    and calculates its roots using the quadratic formula. Display the roots on the console. If the equation has no real roots,
    display the message "No real roots"
 */

package module_1_3;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first coefficient of a quadratic equation: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second coefficient of a quadratic equation: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the third coefficient of a quadratic equation: ");
        double c = Double.parseDouble(scanner.nextLine());

        double discriminant = Math.pow(b, 2) - 4*a*c;

        if (discriminant > 0) {
            double discriminantSqrt = Math.sqrt(discriminant);
            double firstRoot = (-b + discriminantSqrt) / (2 * a);
            double secondRoot = (-b - discriminantSqrt) / (2 * a);

            System.out.printf("Two real and different roots: %f and %f.", firstRoot, secondRoot);
        } else if (discriminant == 0) {
            double discriminantSqrt = Math.sqrt(discriminant);
            double root = (-b + discriminantSqrt) / (2 * a);

            System.out.printf("One real root: %f.", root);
        } else {
            System.out.print("No real roots.");
        }
    }
}
