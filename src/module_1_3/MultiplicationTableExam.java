/**
 In primary school, students must memorize the multiplication tables for numbers 1 to 10.
 Create a program to assist primary school students that presents the user
 with ten randomly generated multiplication problems, where the factors are integers between one and ten.
 After each answer, the program indicates whether it was correct or not.
 The user receives one point for each correctly answered question.
 If the user scores ten points for the entire set of problems,
 the program congratulates them on mastering the multiplication tables and terminates.
 Otherwise, the program starts a new set of problems.
 */

package module_1_3;
import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while(score != 10) {
            score = 0;
            for (int i = 0; i < 10; i++) {
                int firstFactor = (int) (Math.random() * 10) + 1;
                int secondFactor = (int) (Math.random() * 10) + 1;
                int questionIdx = i + 1;

                System.out.printf("Question %d: %d x %d = ", questionIdx, firstFactor, secondFactor);

                int answer = scanner.nextInt();
                int product = firstFactor * secondFactor;

                if (answer == product) {
                    score++;
                    System.out.println("Right answer!");
                } else {
                    System.out.println("Wrong answer!");
                }
            }
        }

        System.out.print("Well done! You’ve mastered the multiplication table.");
    }
}
