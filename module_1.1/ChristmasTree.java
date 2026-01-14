/*
Write a program that prints the following:
           *
          ***
         *****
        *******
The program should print the exact number of spaces and asterisks shown above.
*/

public class ChristmasTree {
    public static void main(String[] args) {
        String asterisk = "*", space = " ";
        int counter = 8;
        int start = counter / 2;

        for (int i = 1; i < counter; i++) {
            boolean is_odd = i % 2 != 0;

            if (is_odd) {
                String spaces = space.repeat(start), asterisks = asterisk.repeat(i);
                System.out.println(spaces + asterisks);
                start = start - 1;
            }
        }
    }
}
