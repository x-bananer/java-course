/**
Prime number generator
Write a program that prompts the user to enter two positive integers, start and end (where start < end).
The program should generate and display all the prime numbers between start and end, inclusive.
A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.
*/

package module_1_3;
import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = 0;
        int secondInt = 0;

        while (firstInt <= 0) {
            System.out.print("Enter a positive integer: ");
            firstInt = scanner.nextInt();
        }

        while (firstInt >= secondInt) {
            System.out.print("Enter a larger positive integer: ");
            secondInt = scanner.nextInt();
        }

        int pointer = firstInt;

        while (pointer <= secondInt) {
            // Luku 1 ei ole alkuluku
            if (pointer != 1) {
                boolean isPrimary = true;

                /*
                 Yhdistetyllä luvulla on aina jakaja, joka on enintään luvun neliöjuuri.
                 Siksi riittää tarkistaa jaollisuus vain neliöjuureen asti.
                */
                double pointerSqrt = Math.sqrt(pointer);

                for (int i = 2; i <= pointerSqrt; i++) {
                    // Jos jakaja löytyy, luku ei ole alkuluku; muuten se on alkuluku
                    if (pointer % i == 0) {
                        isPrimary = false;
                        break;
                    }
                }

                if (isPrimary) {
                    System.out.printf("%d ", pointer);
                }
            }

            pointer++;
        }
    }
}
