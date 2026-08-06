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

    // ---------- Program 4: SELECT using ResultSet ----------
    static void program4() {
        System.out.println("===== Program 4 - SELECT (ResultSet) =====");
        try (Connection con = DriverManager.getConnection(URL);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            // rs.next() moves to the next row, returns false when no rows left
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | "
                        + rs.getString("name") + " | "
                        + rs.getInt("marks"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- Program 5: INSERT using PreparedStatement (the safe way) ----------
    static void program5() {
        System.out.println("===== Program 5 - INSERT (PreparedStatement) =====");
        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO students VALUES (?, ?, ?)")) {

            // ? are placeholders - filled in safely, prevents SQL injection
            ps.setInt(1, 2);
            ps.setString(2, "Bob");
            ps.setInt(3, 85);
            System.out.println("Rows inserted: " + ps.executeUpdate());

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- Program 6: UPDATE ----------
    static void program6() {
        System.out.println("===== Program 6 - UPDATE =====");
        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement ps = con.prepareStatement(
                     "UPDATE students SET marks = ? WHERE id = ?")) {

            ps.setInt(1, 95);
            ps.setInt(2, 1);
            System.out.println("Rows updated: " + ps.executeUpdate());

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- Program 7: DELETE ----------
    static void program7() {
        System.out.println("===== Program 7 - DELETE =====");
        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement ps = con.prepareStatement(
                     "DELETE FROM students WHERE id = ?")) {

            // Insert a throwaway row first so there's something real to delete.
            try (Statement setup = con.createStatement()) {
                setup.executeUpdate("INSERT INTO students VALUES (99, 'Temp', 0)");
            }

            ps.setInt(1, 99);
            System.out.println("Rows deleted: " + ps.executeUpdate());

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- Program 8: SELECT with a WHERE condition ----------
    static void program8() {
        System.out.println("===== Program 8 - SELECT with WHERE =====");
        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement ps = con.prepareStatement(
                     "SELECT * FROM students WHERE marks > ?")) {

            ps.setInt(1, 80);
            try (ResultSet rs = ps.executeQuery()) {   // executeQuery = for SELECT
                while (rs.next()) {
                    System.out.println(rs.getString("name") + " scored " + rs.getInt("marks"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- Program 9: Batch Insert (many rows at once) ----------
    static void program9() {
        System.out.println("===== Program 9 - Batch Insert =====");
        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO students VALUES (?, ?, ?)")) {

            ps.setInt(1, 3); ps.setString(2, "Charlie"); ps.setInt(3, 78);
            ps.addBatch();

            ps.setInt(1, 4); ps.setString(2, "Diana");   ps.setInt(3, 88);
            ps.addBatch();

            int[] result = ps.executeBatch();   // sends all at once - faster
            System.out.println("Rows inserted in batch: " + result.length);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------- Program 10: Transaction (all-or-nothing) ----------
    static void program10() {
        System.out.println("===== Program 10 - Transaction =====");
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL);
            con.setAutoCommit(false);   // turn OFF auto-save

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE students SET marks = marks + 5 WHERE id = ?");
            ps.setInt(1, 1);
            ps.executeUpdate();

            con.commit();               // save all changes together
            System.out.println("Transaction committed.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback();     // undo everything if anything failed
                    System.out.println("Transaction rolled back.");
                }
            } catch (SQLException ex) {
                System.out.println("Rollback failed: " + ex.getMessage());
            }
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Close failed: " + e.getMessage());
            }
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
        System.out.println();
        System.out.println("=== Program 4: SELECT using ResultSet ===");
        program4();
        System.out.println();
        System.out.println("=== Program 5: INSERT using PreparedStatement (the safe way) ===");
        program5();
        System.out.println();
        System.out.println("=== Program 6: UPDATE ===");
        program6();
        System.out.println();
        System.out.println("=== Program 7: DELETE ===");
        program7();
        System.out.println();
        System.out.println("=== Program 8: SELECT with a WHERE condition ===");
        program8();
        System.out.println();
        System.out.println("=== Program 9: Batch Insert (many rows at once) ===");
        program9();
        System.out.println();
        System.out.println("=== Program 10: Transaction (all-or-nothing) ===");
        program10();
    }
}
