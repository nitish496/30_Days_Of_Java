import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program08 {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("student_notes.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("Student Name: Rahul");
            writer.newLine();

            writer.write("Roll Number: 103");
            writer.newLine();

            writer.write("Course: Java Programming");
            writer.newLine();

            writer.write("Marks: 88");
            writer.newLine();

            writer.close();

            System.out.println("Data written successfully using BufferedWriter.");
        } catch (IOException exception) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}