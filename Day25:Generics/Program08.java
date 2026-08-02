interface Repository<T> {
    void save(T item);
}

// We implement the interface and explicitly state we are using Strings!
class UserRepository implements Repository<String> {
    @Override
    public void save(String user) { 
        System.out.println("User Saved to Database: " + user); 
    }
}

public class Program08 {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        repo.save("Admin_Nitish");
    }
}
