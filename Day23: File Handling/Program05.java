import java.io.FileReader;
import java.io.IOException;

public class Program05 {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("student_notes.txt");

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
        } catch (IOException exception) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}