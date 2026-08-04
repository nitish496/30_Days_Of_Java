import java.sql.*;

public class Main {

    // SQLite needs no username/password - the "database" is just this file.
    // Run from the repo root so this relative path resolves to ./javadb.db
    static final String URL = "jdbc:sqlite:javadb.db";

    // ---------- Program 1: Connecting to the database ----------
    static void program1() {
        System.out.println("===== Program 1 - Connection =====");
        try (Connection con = DriverManager.getConnection(URL)) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    // ---------- Program 2: Creating the table ----------
    static void program2() {
        System.out.println("===== Program 2 - CREATE TABLE =====");
        String sql = "CREATE TABLE IF NOT EXISTS students ("
                + "id INTEGER PRIMARY KEY, "
                + "name VARCHAR(50), "
                + "marks INTEGER)";

        try (Connection con = DriverManager.getConnection(URL);
             Statement stmt = con.createStatement()) {

            stmt.execute(sql);
            System.out.println("Table 'students' ready.");

            // Wipe old demo rows so this file gives the same output every run.
            stmt.executeUpdate("DELETE FROM students");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- Program 3: INSERT using Statement ----------
    static void program3() {
        System.out.println("===== Program 3 - INSERT (Statement) =====");
        try (Connection con = DriverManager.getConnection(URL);
             Statement stmt = con.createStatement()) {

            String sql = "INSERT INTO students VALUES (1, 'Alice', 90)";
            int rows = stmt.executeUpdate(sql);   // executeUpdate = for INSERT/UPDATE/DELETE
            System.out.println("Rows inserted: " + rows);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- main ----------
    public static void main(String[] args) {
        System.out.println("=== Program 1: Connecting to the database ===");
        program1();
        System.out.println();
        System.out.println("=== Program 2: Creating the table ===");
        program2();
        System.out.println();
        System.out.println("=== Program 3: INSERT using Statement ===");
        program3();
    }
}
