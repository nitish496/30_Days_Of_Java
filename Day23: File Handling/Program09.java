import java.io.File;

public class Program09{
    public static void main(String[] args) {
        File file = new File("Studentnotes.txtß");
       
        if(file.delete()){
            System.out.println("File has been successfully deleted.");
        }else{
            System.out.println("Error,could not delete the file.");
        }
    }
}