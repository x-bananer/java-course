package module_1_1;
/*
Modify the program so that the program also prints the product and average of the three integers.
Hint: try the modified program with integers 3, 4, and 6.
The sum should be 13, the product 72, and the average 4.3333333333333.
*/

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));

        /*
            The division operator / performs integer division if both operands are of type int.
            Integer division discards the remainder.
            To get the correct average value, we need to convert the variables to a floating-point type, e.g. double.
        */
        System.out.println("The average of the numbers is " + ((double) (first + second + third) / 3));
    }
}
