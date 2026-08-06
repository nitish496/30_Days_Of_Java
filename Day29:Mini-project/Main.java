import java.util.*;
import java.io.*;

// =========================================
// Day 29 - Mini Project
// Student Management System
// =========================================

// ---- Model class (Encapsulation) ----
class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-8d %-5s", id, name, marks, getGrade());
    }

    // Format used when saving to file
    public String toFileString() {
        return id + "," + name + "," + marks;
    }
}

// ---- Custom Exception ----
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

// ---- Service class (business logic) ----
class StudentManager {
    private Map<Integer, Student> students = new LinkedHashMap<>();
    private static final String FILE_NAME = "students.txt";

    public void addStudent(Student s) {
        if (students.containsKey(s.getId())) {
            System.out.println("Error: ID " + s.getId() + " already exists.");
            return;
        }
        students.put(s.getId(), s);
        System.out.println("Student added successfully.");
    }

    public void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.printf("%-5s %-15s %-8s %-5s%n", "ID", "NAME", "MARKS", "GRADE");
        System.out.println("-----------------------------------");
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    public Student search(int id) throws StudentNotFoundException {
        Student s = students.get(id);
        if (s == null) {
            throw new StudentNotFoundException("No student found with ID: " + id);
        }
        return s;
    }

    public void updateMarks(int id, int newMarks) throws StudentNotFoundException {
        Student s = search(id);
        s.setMarks(newMarks);
        System.out.println("Marks updated for " + s.getName());
    }

    public void delete(int id) throws StudentNotFoundException {
        Student s = search(id);
        students.remove(id);
        System.out.println("Deleted: " + s.getName());
    }
}

// ---- Main application ----
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nitish", 92);
        Student s2 = new Student(2, "Aarav", 67);

        System.out.printf("%-5s %-15s %-8s %-5s%n", "ID", "NAME", "MARKS", "GRADE");
        System.out.println("-----------------------------------");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\nGrade boundaries in action:");
        System.out.println(new Student(3, "Meera", 45).getGrade());
        System.out.println(new Student(4, "Kabir", 30).getGrade());

        s2.setMarks(88);
        System.out.println("\nAfter updating Aarav's marks -> " + s2);

        System.out.println("\nCSV form used for file storage:");
        System.out.println(s1.toFileString());
        System.out.println(s2.toFileString());

        System.out.println("\n--- Storing students in the manager ---");
        StudentManager manager = new StudentManager();
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(new Student(3, "Meera", 45));
        manager.addStudent(new Student(1, "Duplicate Id", 50));

        System.out.println("\n--- All students on record ---");
        manager.viewAll();

        System.out.println("\n--- Searching by ID ---");
        try {
            System.out.println(manager.search(2));
            System.out.println(manager.search(99));
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Updating marks ---");
        try {
            manager.updateMarks(3, 78);
            manager.viewAll();
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Deleting a record ---");
        try {
            manager.delete(2);
            manager.viewAll();
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
