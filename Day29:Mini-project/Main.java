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
    }
}
