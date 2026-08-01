import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program10 {

    static final String FILE_NAME = "student_records.txt";
    static final Scanner scanner = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        System.out.print("Enter marks: ");
        String marks = scanner.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(FILE_NAME, true)
            );

            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Roll Number: " + rollNumber);
            writer.newLine();
            writer.write("Course: " + course);
            writer.newLine();
            writer.write("Marks: " + marks);
            writer.newLine();
            writer.write("------------------------------");
            writer.newLine();

            writer.close();

            System.out.println("Student record added successfully.");
        } catch (IOException exception) {
            System.out.println("Unable to add the student record.");
        }
    }

    static void viewStudents() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No student records found.");
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(FILE_NAME)
            );

            String line;
            boolean hasRecords = false;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                hasRecords = true;
            }

            reader.close();

            if (!hasRecords) {
                System.out.println("No student records found.");
            }
        } catch (IOException exception) {
            System.out.println("Unable to read student records.");
        }
    }

    static void searchStudent() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.print("Enter roll number to search: ");
        String requiredRollNumber = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(FILE_NAME)
            );

            String nameLine;
            boolean studentFound = false;

            while ((nameLine = reader.readLine()) != null) {
                String rollLine = reader.readLine();
                String courseLine = reader.readLine();
                String marksLine = reader.readLine();
                String separatorLine = reader.readLine();

                if (rollLine != null &&
                        rollLine.equals("Roll Number: " + requiredRollNumber)) {

                    System.out.println(nameLine);
                    System.out.println(rollLine);
                    System.out.println(courseLine);
                    System.out.println(marksLine);
                    System.out.println(separatorLine);

                    studentFound = true;
                    break;
                }
            }

            reader.close();

            if (!studentFound) {
                System.out.println("Student record not found.");
            }
        } catch (IOException exception) {
            System.out.println("Unable to search student records.");
        }
    }

    static void deleteRecords() {
        File file = new File(FILE_NAME);

        if (file.delete()) {
            System.out.println("All student records deleted successfully.");
        } else {
            System.out.println("No record file was found.");
        }
    }

    static void displayMenu() {
        System.out.println();
        System.out.println("1. Add student");
        System.out.println("2. View students");
        System.out.println("3. Search student");
        System.out.println("4. Delete all records");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                choice = 0;
            }

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteRecords();
                    break;

                case 5:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Enter a valid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}