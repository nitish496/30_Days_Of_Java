import java.io.FileWriter;
import java.io.IOException;

public class Program04{
    public static void main(String[] args) {
        try{
        FileWriter writer  = new FileWriter("student.txt");
        writer.write("Name:Aman/n");
                    writer.write("Roll Number: 101\n");
            writer.write("Course: Java Programming\n");
            writer.write("Marks: 85\n");

            writer.close();
            System.out.println("Data transfered successfull");
        }catch(IOException exception){
        System.out.println("Error occured during the data transfer.");
        }
    }
}