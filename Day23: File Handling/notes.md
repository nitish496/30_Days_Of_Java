# 📅 Day 23 – File Handling

Welcome to Day 23! 🚀 Today, we make our data permanent!
Up until now, our data lived in temporary RAM and vanished when the program closed. Today, we learn how to talk directly to the hard drive using the `java.io` package. 💾

✅ Create Files | ✅ Read Data | ✅ Write Data | ✅ Append Data | ✅ Delete Files

---

# 📖 Quick Intro
- 📦 **java.io Package:** You must import this to work with files.
- 📄 **File Class:** Creates an object that points to a file path. (It doesn't physically create the file!).
- ✍️ **FileWriter:** Writes data. By default, it deletes old data (Overwrite Mode). Pass `true` to enable Append Mode.
- 📖 **FileReader:** Reads data character by character.
- 🚀 **BufferedReader / BufferedWriter:** Extremely fast versions of readers and writers that read/write in large chunks!

---

# =========================================
# 1. Introduction to File Handling 🌍
# =========================================
**🎯 Objective:** Verify if a file exists on the hard drive before doing anything.
```java
import java.io.File;

public class Program1 {
    public static void main(String[] args) {
        // Point to a file
        File file = new File("intro.txt");
        
        // Check if it exists physically!
        System.out.println("Does intro.txt exist? " + file.exists());
    }
}
```

---

# =========================================
# 2. Understanding the File Class ℹ️
# =========================================
**🎯 Objective:** Extract metadata (name, path, size) from a file.
```java
import java.io.File;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println("File Name: " + file.getName());
        System.out.println("Full Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
    }
}
```

---

# =========================================
# 3. Creating a File 🏗️
# =========================================
**🎯 Objective:** Ask the OS to physically create an empty text file on the hard disk.
```java
import java.io.File;
import java.io.IOException; // ⚠️ Must catch this!

public class Program3 {
    public static void main(String[] args) {
        try {
            File file = new File("new_file.txt");
            if (file.createNewFile()) {
                System.out.println("File physically created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file.");
        }
    }
}
```

---

# =========================================
# 4. Writing Data to a File ✍️
# =========================================
**🎯 Objective:** Save text inside a file (Overwrite Mode).
```java
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("new_file.txt");
            writer.write("Hello, Java File Handling!");
            writer.close(); // ⚠️ Crucial! Data won't save if you forget this!
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing.");
        }
    }
}
```

---

# =========================================
# 5. Reading Data from a File 📖
# =========================================
**🎯 Objective:** Read data character by character.
```java
import java.io.FileReader;
import java.io.IOException;

public class Program5 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("new_file.txt");
            int data;
            // .read() returns -1 when the file is empty!
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); // Convert int to char
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading.");
        }
    }
}
```

---

# =========================================
# 6. Appending Data to a File ➕
# =========================================
**🎯 Objective:** Add new text without deleting the old text!
```java
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {
    public static void main(String[] args) {
        try {
            // 🎯 pass 'true' to enable Append Mode!
            FileWriter writer = new FileWriter("new_file.txt", true); 
            writer.write("\nAdding a second line of text!");
            writer.close();
            System.out.println("Data successfully appended.");
        } catch (IOException e) {
            System.out.println("Error appending.");
        }
    }
}
```

---

# =========================================
# 7. Reading a File Using BufferedReader 🚀
# =========================================
**🎯 Objective:** Read massive files instantly, line by line.
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("new_file.txt"));
            String line;
            // .readLine() returns null when finished!
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading.");
        }
    }
}
```

---

# =========================================
# 8. Writing Data Using BufferedWriter ⚡
# =========================================
**🎯 Objective:** Write large amounts of data to a file rapidly.
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program8 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("fast_file.txt"));
            bw.write("High speed writing!");
            bw.newLine(); // Safely adds a new line
            bw.write("Done.");
            bw.close();
            System.out.println("Buffered write complete.");
        } catch (IOException e) {
            System.out.println("Error writing.");
        }
    }
}
```

---

# =========================================
# 9. Deleting a File 🗑️
# =========================================
**🎯 Objective:** Permanently erase a file from the hard drive.
```java
import java.io.File;

public class Program9 {
    public static void main(String[] args) {
        File file = new File("fast_file.txt");
        if (file.delete()) { // Skips the Recycle Bin!
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete. File doesn't exist.");
        }
    }
}
```

---

# =========================================
# 10. Student Record Management System 🎓
# =========================================
**🎯 Objective:** Build a real-world permanent database file!
```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("students.txt", true); // Append mode!
            writer.write("Name: " + name + " | Grade: " + grade + "\n");
            writer.close();
            System.out.println("Student record permanently saved to database!");
        } catch (IOException e) {
            System.out.println("Database Error!");
        }
        sc.close();
    }
}
```

---

# 🧠 5 Quick Interview Questions
1. **Does `new File("test.txt")` create a physical file?** No, it just creates a Java object in RAM pointing to a path. You must call `.createNewFile()`.
2. **What exception is thrown if a file operation fails?** `IOException` (It is a Checked Exception, meaning the compiler forces you to handle it).
3. **What is the difference between `FileWriter` and `BufferedWriter`?** `FileWriter` writes character-by-character (slow). `BufferedWriter` saves data to a temporary memory buffer and writes massive chunks at once (fast).
4. **How do you append data without deleting the old data?** Pass `true` as the second argument: `new FileWriter("file.txt", true);`
5. **Why MUST we call `.close()` on a writer?** If you don't close it, the data stuck in the memory buffer might never actually be flushed/written to the hard drive!

---

# ❓ 5 Practice Questions
1. 📝 Create a program that generates a file named `my_diary.txt` and checks if it exists.
2. 💻 Write a loop that writes the numbers 1 to 100 into a file, one number per line.
3. 🛑 Read the numbers from the file in Exercise 2 and print them to the console using `BufferedReader`.
4. 🦸‍♂️ Ask the user for 3 secret passwords, and append them safely to `secrets.txt`.
5. 🔀 Create a file, write data to it, and then write code to delete it immediately after reading it!

---

# ⭐ 5 Challenge Programs
1. 🏦 **ATM Receipt Generator:** Ask the user for a withdrawal amount, subtract it from a variable, and generate a `.txt` receipt file with the remaining balance.
2. 📖 **Word Counter:** Read a text file and count exactly how many words are inside it!
3. 📋 **To-Do List Manager:** Let the user type tasks in the console, and append them to `todo.txt`. Write a second method to print all tasks!
4. 💥 **File Copier:** Read all the text from `source.txt` and write it perfectly into `destination.txt`.
5. 🤫 **File Merger:** Read data from two different text files, combine the data in Java, and write the combined result to a third file!

---

> *"Variables forget. Files remember."* 💾

---

# 🚀 Next Day Preview: Day 24 – Java Collections Framework (ArrayList)
You've learned standard Arrays (`int[] arr = new int[5]`), but they have a fatal flaw: **Their size is fixed.** If you want to add a 6th element, the array explodes! 💥

Tomorrow, we dive into the **Collections Framework**, starting with the legendary `ArrayList`. You will learn how to create arrays that can shrink, grow, and adapt dynamically. Get ready to supercharge your data structures! 🚀🔥
