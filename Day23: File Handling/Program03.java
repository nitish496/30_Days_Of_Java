import java.io.File;
import java.io.IOException;

public class Program03 {

    public static void main(String[] args) {

        File file = new File("student_notes.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
                System.out.println("File name: " + file.getName());
                System.out.println("File path: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exception) {
            System.out.println("An error occurred while creating the file.");
        }
    }
}