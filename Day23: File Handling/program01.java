import java.io.File;

public class program01 {
    public static void main(String[] args) {
        File file = new File("student_notes.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("File exists: " + file.exists());
    }
}
