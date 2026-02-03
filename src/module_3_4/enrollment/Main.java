package module_3_4.enrollment;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Ksenia", 29);
        Course course = new Course("12345", "Physics", "Heikki Lauranto");
        Enrollment enrollment = new Enrollment(student, course, "03.02.2026");

        try {
            FileOutputStream output = new FileOutputStream("enrollments.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(output);

            objectOutput.writeObject(enrollment);
            objectOutput.close();

            System.out.println("Provided students data are saved to the file.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream input = new FileInputStream("enrollments.ser");
            ObjectInputStream objectInput = new ObjectInputStream(input);

            Enrollment readEnrollment = (Enrollment) objectInput.readObject();

            objectInput.close();

            System.out.println("Information about students:");
            System.out.println(readEnrollment);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}