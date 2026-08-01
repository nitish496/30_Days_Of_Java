import java.io.File;

public class Program02 {
    public static void main(String[] args) {
        File file = new File("student_notes.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File exists: " + file.exists());
        System.out.println("Is a file: " + file.isFile());
        System.out.println("Is a directory: " + file.isDirectory());
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("File size: " + file.length() + " bytes");
    }
}
