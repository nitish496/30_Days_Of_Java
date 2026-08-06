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

    public void showTopper() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        Student topper = Collections.max(
                students.values(),
                Comparator.comparingInt(Student::getMarks));
        System.out.println("Topper: " + topper.getName() + " with " + topper.getMarks() + " marks");
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students.values()) {
                writer.write(s.toFileString());
                writer.newLine();
            }
            System.out.println("Data saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No saved data found.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            students.clear();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                students.put(Integer.parseInt(parts[0]),
                        new Student(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2])));
            }
            System.out.println("Data loaded from " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}

// ---- Main application ----
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Show Topper");
            System.out.println("7. Save to File");
            System.out.println("8. Load from File");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = Integer.parseInt(sc.nextLine());
                        manager.addStudent(new Student(id, name, marks));
                        break;

                    case 2:
                        manager.viewAll();
                        break;

                    case 3:
                        System.out.print("Enter ID to search: ");
                        System.out.println(manager.search(Integer.parseInt(sc.nextLine())));
                        break;

                    case 4:
                        System.out.print("Enter ID: ");
                        int uid = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter new marks: ");
                        manager.updateMarks(uid, Integer.parseInt(sc.nextLine()));
                        break;

                    case 5:
                        System.out.print("Enter ID to delete: ");
                        manager.delete(Integer.parseInt(sc.nextLine()));
                        break;

                    case 6:
                        manager.showTopper();
                        break;

                    case 7:
                        manager.saveToFile();
                        break;

                    case 8:
                        manager.loadFromFile();
                        break;

                    case 9:
                        System.out.println("Exiting... Goodbye!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try 1-9.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            } catch (StudentNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}