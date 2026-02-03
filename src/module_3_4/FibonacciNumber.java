package module_3_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciNumber {
    public static void main(String[] args) {
        long first = 0;
        long second = 1;
        long temp;

        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("fibonacci numbers.csv")
            );

            writer.write("idx;number");
            writer.newLine();

            for (int i = 0; i <= 60; i++) {
                writer.write(i + ";" + first);
                writer.newLine();

                temp = first + second;
                first = second;
                second = temp;
            }

            writer.close();
            System.out.println("The job is done!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
