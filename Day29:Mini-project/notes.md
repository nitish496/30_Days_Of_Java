# 📅 Day 29 – Mini Projects (Core Java Project Development)

Welcome to Day 29! 🚀 Today, we stop learning syntax and start building **Real Software**.
You will learn the architectural building blocks used by professionals to build scalable, robust applications. 

✅ Layered Architecture | ✅ Menus | ✅ Services | ✅ DAO Pattern | ✅ Exception Handling

---

# 📖 Quick Intro to Project Architecture
Professional projects separate code into distinct layers (folders):
- **Model:** The data templates (e.g., `Student`, `Book`).
- **View (UI):** The Menus and Scanners that interact with the user.
- **Service:** The brain/business logic (e.g., checking if a student is valid).
- **DAO (Storage):** The code that talks to Files or Databases.

---

# =========================================
# 1. The Interactive Menu System 🖥️
# =========================================
**🎯 Objective:** Create an infinite loop menu to keep your application running.
```java
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: System.out.println("Depositing money..."); break;
                case 2: System.out.println("Withdrawing money..."); break;
                case 3: 
                    System.out.println("Exiting System. Goodbye!");
                    running = false; // Breaks the loop!
                    break;
                default: System.out.println("Invalid Option!");
            }
        }
        sc.close();
    }
}
```

---

# =========================================
# 2. The Model Class (Encapsulation) 📦
# =========================================
**🎯 Objective:** Design a strict Model class to hold data securely.
```java
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters prevent unwanted modification!
    public int getId() { return id; }
    public String getName() { return name; }
    
    @Override
    public String toString() {
        return "Student[ID: " + id + ", Name: " + name + "]";
    }
}

public class Program2 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        System.out.println(s1.toString());
    }
}
```

---

# =========================================
# 3. Input Validation (Preventing Crashes) 🛡️
# =========================================
**🎯 Objective:** Stop users from crashing your app by typing text when you want a number!
```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = -1;

        while (age == -1) {
            try {
                System.out.print("Enter your age: ");
                age = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Please enter a valid NUMBER!");
                sc.next(); // Clear the bad input from the scanner buffer!
            }
        }
        
        System.out.println("✅ Age saved as: " + age);
        sc.close();
    }
}
```

---

# =========================================
# 4. Custom Exceptions (Business Logic) ⚠️
# =========================================
**🎯 Objective:** Create custom errors for specific business rules (e.g., Insufficient Funds).
```java
// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Program4 {
    static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("❌ Transaction Failed! Not enough money.");
        }
        System.out.println("✅ Withdrawn: $" + amount);
    }

    public static void main(String[] args) {
        try {
            withdraw(500, 600); // Attempt to withdraw too much
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

---

# =========================================
# 5. In-Memory Storage (Collections) 🗂️
# =========================================
**🎯 Objective:** Store dynamically created objects in RAM using an ArrayList.
```java
import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    Product(String name) { this.name = name; }
}

public class Program5 {
    public static void main(String[] args) {
        List<Product> inventory = new ArrayList<>();
        
        // Add to RAM
        inventory.add(new Product("Laptop"));
        inventory.add(new Product("Mouse"));
        
        // Read from RAM
        System.out.println("--- Current Inventory ---");
        for (Product p : inventory) {
            System.out.println("- " + p.name);
        }
    }
}
```

---

# =========================================
# 6. Saving Data to a File 💾
# =========================================
**🎯 Objective:** Save your project data permanently before the app closes!
```java
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {
    public static void main(String[] args) {
        String dataToSave = "ID:101, Name:John, Score:95";
        
        try (FileWriter writer = new FileWriter("database.txt", true)) { // 'true' enables append mode!
            writer.write(dataToSave + "\n");
            System.out.println("✅ Data saved to database.txt successfully!");
        } catch (IOException e) {
            System.out.println("❌ Failed to save data: " + e.getMessage());
        }
    }
}
```

---

# =========================================
# 7. Reading Data from a File 📂
# =========================================
**🎯 Objective:** Load your project data back into memory when the app launches.
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program7 {
    public static void main(String[] args) {
        System.out.println("--- Loading Data ---");
        
        try (BufferedReader reader = new BufferedReader(new FileReader("database.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Record Found: " + line);
            }
        } catch (IOException e) {
            System.out.println("❌ File not found. Starting with empty database.");
        }
    }
}
```

---

# =========================================
# 8. The Singleton Pattern (Database Setup) 🏗️
# =========================================
**🎯 Objective:** Ensure your app only creates ONE database connection, saving massive memory!
```java
class DBConnection {
    private static DBConnection instance;
    
    // Private constructor prevents others from making new instances
    private DBConnection() {
        System.out.println("Establishing Heavy Database Connection...");
    }
    
    // The only way to get the connection!
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}

public class Program8 {
    public static void main(String[] args) {
        // Calling it 3 times only creates it ONCE!
        DBConnection conn1 = DBConnection.getInstance();
        DBConnection conn2 = DBConnection.getInstance();
        DBConnection conn3 = DBConnection.getInstance();
        
        System.out.println("Are conn1 and conn2 the exact same object? " + (conn1 == conn2));
    }
}
```

---

# =========================================
# 9. The DAO Pattern (Data Access Object) 🏛️
# =========================================
**🎯 Objective:** Separate ALL database queries into one specific interface.
```java
// Interface forces standard methods
interface UserDAO {
    void saveUser(String name);
    void deleteUser(int id);
}

// Implementation class writes the actual logic
class UserDatabaseDAO implements UserDAO {
    public void saveUser(String name) { System.out.println("SQL: INSERT INTO Users... " + name); }
    public void deleteUser(int id) { System.out.println("SQL: DELETE FROM Users... " + id); }
}

public class Program9 {
    public static void main(String[] args) {
        UserDAO db = new UserDatabaseDAO();
        db.saveUser("Bob");
        db.deleteUser(1);
    }
}
```

---

# =========================================
# 10. The Complete Mini-Project (Putting it together) 🏆
# =========================================
**🎯 Objective:** A tiny but complete Application utilizing OOP, Collections, and Loops!
```java
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String name;
    Task(String name) { this.name = name; }
}

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        
        System.out.println("🌟 Welcome to the Task Manager 🌟");
        
        while (true) {
            System.out.println("\n1. Add Task  |  2. View Tasks  |  3. Exit");
            System.out.print("> ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer
            
            if (choice == 1) {
                System.out.print("Enter task description: ");
                tasks.add(new Task(sc.nextLine()));
                System.out.println("✅ Task Added!");
            } 
            else if (choice == 2) {
                System.out.println("--- Your Tasks ---");
                if (tasks.isEmpty()) System.out.println("No tasks yet.");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i+1) + ". " + tasks.get(i).name);
                }
            } 
            else if (choice == 3) {
                System.out.println("Saving to file... Goodbye!");
                break;
            } 
            else {
                System.out.println("❌ Invalid Choice.");
            }
        }
        sc.close();
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **What is a Layered Architecture?** Separating an application into independent tiers (e.g., Presentation Layer, Service Layer, Database Layer) so changes in one don't break the others.
2. **What is the DAO Pattern?** Data Access Object. It abstracts and encapsulates all access to the data source (database/file), hiding the SQL from the rest of the application.
3. **What is the Singleton Pattern?** A design pattern that ensures a class has only ONE instance globally (used extensively for Database Connections).
4. **Why is Input Validation important?** Users are unpredictable. If your scanner expects an `int` and they type a `String`, the app will crash with an `InputMismatchException` unless validated.
5. **Why should you never write all your code in the `main` method?** It violates Object-Oriented principles, makes code unreadable, impossible to test, and impossible to reuse.

---

# 🚀 Next Day Preview: Day 30 – Final Core Java Revision
You did it. You learned how to structure real software! 

Tomorrow is the **Grand Finale: Day 30**. We will do a massive, complete revision of everything we have learned in Core Java. We will discuss interview preparation, how to build a GitHub portfolio, career roadmaps, and what your next steps are. Get ready to celebrate your mastery of Java! 🎉🔥
