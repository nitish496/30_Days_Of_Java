import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program07 {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("student_notes.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException exception) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}