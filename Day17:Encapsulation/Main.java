
/*
==========================================
        DAY 17 - ENCAPSULATION
==========================================

Topics Covered:
1. Private Variables (Data Hiding)
2. Getter Methods (Read-Only)
3. Setter Methods (Write-Only)
4. Complete Encapsulation (Getters & Setters)
5. Validation in Setters
6. Bank Account (Real-world Example)
7. Student Management Mini-Project
8. Employee Management Mini-Project

Author: Nitish
==========================================
*/

// =========================================
// Program 1 - Private Data
// =========================================
class Student {
    private String name = "Nitish";

    public void display() {
        System.out.println("Name : " + name);
    }
}

// =========================================
// Program 2 - Multiple Private Fields
// =========================================
class StudentDetails {
    private String name = "Nitish";
    private int age = 19;

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// =========================================
// Program 3 - Getter Methods (Read Access)
// =========================================
class StudentWithGetters {
    private String name = "Raju";
    private int age = 19;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// =========================================
// Program 4 - Setter Methods (Write Access)
// =========================================
class StudentWithSetters {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name; // 'this' resolves variable shadowing
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// =========================================
// Program 5 - Fully Encapsulated Class
// =========================================
class StudentEncapsulated {
    private String name;
    private int age;
    private String course;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }
}

// =========================================
// Program 6 - Setters with Validation
// =========================================
class StudentValidated {
    private String name;
    private int age;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks!");
        }
    }

    public void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }
}

// =========================================
// Program 7 - Custom Entity (Person)
// =========================================
class Person {
    private String name;
    private int marks;
    private String job;

    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { this.marks = marks; }
    public void setJob(String job) { this.job = job; }

    public String getName() { return name; }
    public int getMarks() { return marks; }
    public String getJob() { return job; }
}

// =========================================
// Program 8 - Real-World Example (Bank)
// =========================================
class Bank {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " Deposited Successfully.");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + getBalance());
    }
}

// =========================================
// Program 9 - Student Management Project
// =========================================
class StudentManagement {
    private String name;
    private int age;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks!");
        }
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }

    public void display() {
        System.out.println("Name  : " + getName());
        System.out.println("Age   : " + getAge());
        System.out.println("Marks : " + getMarks());
    }
}

// =========================================
// Program 10 - Employee Management Project
// =========================================
class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getEmployeeSalary() { return employeeSalary; }

    public void display() {
        System.out.println("ID     : " + employeeId);
        System.out.println("Name   : " + employeeName);
        System.out.println("Salary : ₹" + employeeSalary);
    }
}

// =========================================
// Main Method - Execution
// =========================================
public class Main {
    public static void main(String[] args) {

        System.out.println("===== Program 1 - Private Data =====");
        Student s1 = new Student();
        s1.display();
        System.out.println();
        
        System.out.println("===== Program 2 - Multiple Private Fields =====");
        StudentDetails s2 = new StudentDetails();
        s2.display();
        System.out.println();
     
        System.out.println("===== Program 3 - Getter Methods =====");
        StudentWithGetters s3 = new StudentWithGetters();
        s3.display();
        System.out.println("Fetched name using getter: " + s3.getName());
        System.out.println();

        System.out.println("===== Program 4 - Setter Methods =====");
        StudentWithSetters s4 = new StudentWithSetters();
        s4.setName("King");
        s4.setAge(20);
        s4.display();
        System.out.println();
        
        System.out.println("===== Program 5 - Fully Encapsulated =====");
        StudentEncapsulated s5 = new StudentEncapsulated();
        s5.setName("Nitish");
        s5.setAge(20);
        s5.setCourse("CSE-AI&ML");

        System.out.println("Name   : " + s5.getName());
        System.out.println("Age    : " + s5.getAge());
        System.out.println("Course : " + s5.getCourse());
        System.out.println();

        System.out.println("===== Program 6 - Validation in Setters =====");
        StudentValidated s6 = new StudentValidated();
        s6.setName("Nitish");
        s6.setAge(19);
        s6.setMarks(89); 
        s6.display(); // FIXED: Was incorrectly calling disper()
        System.out.println();

        System.out.println("===== Program 7 - Custom Entity =====");
        Person s7 = new Person();
        s7.setName("Nitish");
        s7.setMarks(98);
        s7.setJob("Programmer");

        System.out.println("Name  : " + s7.getName());
        System.out.println("Marks : " + s7.getMarks());
        System.out.println("Job   : " + s7.getJob());
        System.out.println();

        System.out.println("===== Program 8 - Bank Account =====");
        Bank account = new Bank();
        account.setAccountHolder("Nitish");
        account.deposit(5000);
        account.withdraw(1500);
        account.display();
        System.out.println();

        System.out.println("===== Program 9 - Student Management =====");
        StudentManagement student1 = new StudentManagement();
        student1.setName("Alice");
        student1.setAge(20);
        student1.setMarks(92);

        StudentManagement student2 = new StudentManagement();
        student2.setName("Bob");
        student2.setAge(21);
        student2.setMarks(87);

        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.display();
        System.out.println();

        System.out.println("===== Program 10 - Employee Management =====");
        Employee e1 = new Employee();
        e1.setEmployeeName("Nitish");
        e1.setEmployeeId(7459);
        e1.setEmployeeSalary(35000.5);
        e1.display();
    }
}

/*
==========================================
End of Day 17

Next Topic:
Inheritance
==========================================
*/
```