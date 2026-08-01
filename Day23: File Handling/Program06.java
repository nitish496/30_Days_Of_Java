import java.io.FileWriter;
import java.io.IOException;

public class Program06 {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student_notes.txt", true);

            writer.write("\nStudent Name: Neha\n");
            writer.write("Roll Number: 102\n");
            writer.write("Course: Java Programming\n");
            writer.write("Marks: 90\n");

            writer.close();

            System.out.println("New data appended successfully.");
        } catch (IOException exception) {
            System.out.println("An error occurred while appending data.");
        }
    }
}