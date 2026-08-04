# 📅 Day 28 – JDBC (Java Database Connectivity)

Welcome to Day 28! 🚀 Today, your programs become permanent!
JDBC is the API that allows your Java application to talk directly to a Relational Database. Here we use SQLite — a whole database that lives in a single file, no server to install. You will learn how to Create, Read, Update, and Delete (CRUD) records securely! 🗄️☕

✅ Connections | ✅ PreparedStatements | ✅ CRUD Operations | ✅ Transactions

---

# 📖 Quick Intro
- **`Connection`:** The physical pipeline to your database.
- **`Statement`:** Used to send standard SQL (vulnerable to SQL injection).
- **`PreparedStatement`:** Pre-compiled SQL with `?` placeholders (100% Secure!).
- **`ResultSet`:** Holds the data retrieved from a `SELECT` query.

## Running these programs
SQLite isn't part of the JDK, so the driver has to be on the classpath — plain `java Main.java` won't find it:
```bash
java -cp ".:lib/sqlite-jdbc-3.53.2.1.jar" "Day28:JDBC (Java Database Connectivity)/Main.java"
```
Run from the **repo root** — the connection string `jdbc:sqlite:javadb.db` is a relative path, so it resolves to the `javadb.db` file sitting there. See `lib/README.md` for how to get the driver jar and recreate the database file.

---

# 🗂️ Program Index

| # | Topic | Method |
|---|-------|------|
| 1 | Connecting to the database | `program1()` |
| 2 | Creating the table | `program2()` |
| 3 | INSERT using Statement | `program3()` |
| 4 | SELECT using ResultSet | `program4()` |
| 5 | INSERT using PreparedStatement | `program5()` |
| 6 | UPDATE | `program6()` |
| 7 | DELETE | `program7()` |
| 8 | SELECT with a WHERE condition | `program8()` |
| 9 | Batch Insert | `program9()` |
| 10 | Transaction | `program10()` |

`Main.java` runs all ten in sequence.

---

# =========================================
# 1. Connecting to the Database 🔌
# =========================================
**🎯 Objective:** Open and close a physical pipeline to the database safely.
```java
import java.sql.*;

// SQLite needs no username/password - the "database" is just this file.
static final String URL = "jdbc:sqlite:javadb.db";

try (Connection con = DriverManager.getConnection(URL)) {
    System.out.println("Connected successfully!");
} catch (SQLException e) {
    System.out.println("Connection failed: " + e.getMessage());
}
```

---

# =========================================
# 2. Creating the Table 🏗️
# =========================================
**🎯 Objective:** Make sure the table exists before anything else touches it.
```java
String sql = "CREATE TABLE IF NOT EXISTS students ("
        + "id INTEGER PRIMARY KEY, "
        + "name VARCHAR(50), "
        + "marks INTEGER)";

try (Connection con = DriverManager.getConnection(URL);
     Statement stmt = con.createStatement()) {

    stmt.execute(sql);
    System.out.println("Table 'students' ready.");

} catch (SQLException e) {
    System.out.println("Error: " + e.getMessage());
}
```
> `CREATE TABLE IF NOT EXISTS` makes this safe to run every time — it won't complain if the table is already there.

---

# =========================================
# 3. Standard Statement (INSERT) ⚠️
# =========================================
**🎯 Objective:** Insert data using the basic `Statement` interface. (Note: not recommended when values come from user input).
```java
try (Connection con = DriverManager.getConnection(URL);
     Statement stmt = con.createStatement()) {

    String sql = "INSERT INTO students VALUES (1, 'Alice', 90)";
    int rows = stmt.executeUpdate(sql); // executeUpdate = for INSERT/UPDATE/DELETE
    System.out.println("Rows inserted: " + rows);

} catch (SQLException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

# =========================================
# 4. Reading Data (SELECT & ResultSet) 📖
# =========================================
**🎯 Objective:** Fetch rows from the database and print them to the console.
```java
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
```

---

# =========================================
# 5. PreparedStatement (INSERT) 🛡️
# =========================================
**🎯 Objective:** The best practice! Insert data securely using `?` placeholders.
```java
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
```

---

# =========================================
# 6. Updating Data (UPDATE) ✏️
# =========================================
**🎯 Objective:** Modify an existing record securely.
```java
try (Connection con = DriverManager.getConnection(URL);
     PreparedStatement ps = con.prepareStatement(
             "UPDATE students SET marks = ? WHERE id = ?")) {

    ps.setInt(1, 95);
    ps.setInt(2, 1);
    System.out.println("Rows updated: " + ps.executeUpdate());

} catch (SQLException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

# =========================================
# 7. Deleting Data (DELETE) 🗑️
# =========================================
**🎯 Objective:** Permanently remove a record from the database.
```java
try (Connection con = DriverManager.getConnection(URL);
     PreparedStatement ps = con.prepareStatement(
             "DELETE FROM students WHERE id = ?")) {

    ps.setInt(1, 99);
    System.out.println("Rows deleted: " + ps.executeUpdate());

} catch (SQLException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

# =========================================
# 8. SELECT with a WHERE condition 🔍
# =========================================
**🎯 Objective:** Filter the returned rows securely using a `PreparedStatement`.
```java
try (Connection con = DriverManager.getConnection(URL);
     PreparedStatement ps = con.prepareStatement(
             "SELECT * FROM students WHERE marks > ?")) {

    ps.setInt(1, 80);
    ResultSet rs = ps.executeQuery();   // executeQuery = for SELECT

    while (rs.next()) {
        System.out.println(rs.getString("name") + " scored " + rs.getInt("marks"));
    }

} catch (SQLException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

# =========================================
# 9. Batch Insert (many rows at once) 📦
# =========================================
**🎯 Objective:** Insert many records at once by grouping them into a single batch!
```java
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
```

---

# =========================================
# 10. Transactions (all-or-nothing) 🤝
# =========================================
**🎯 Objective:** Group multiple queries together. If one fails, UNDO everything!
```java
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
```

---

# ⚠️ Common Mistakes
- **Forgetting the `-cp` flag.** Without the driver jar on the classpath, every connection throws `SQLException: No suitable driver found`.
- **Running from the wrong folder.** `jdbc:sqlite:javadb.db` is a relative path — run from the repo root, or the file won't be found (or a new empty one gets created somewhere unexpected).
- **Using `Statement` with user input.** Always reach for `PreparedStatement` once a value isn't hardcoded — string-concatenated SQL is how SQL injection happens.
- **Not closing connections.** Try-with-resources (`try (Connection con = ...)`) closes them automatically, even if an exception is thrown.

---

# 🧠 5 Quick Interview Questions
1. **What is JDBC?** Java Database Connectivity. It's an API that allows Java to execute SQL queries on relational databases.
2. **Why always use `PreparedStatement`?** It pre-compiles the SQL query for faster execution, and it uses `?` placeholders to prevent SQL Injection.
3. **What is `ResultSet.next()`?** A `ResultSet` points to the rows of returned data. `.next()` moves the cursor down one row. If there is no row left, it returns `false`.
4. **Why use Batch Processing?** Executing many queries individually causes many round trips. Batching packages them together into far fewer round trips — drastically faster.
5. **How do you handle Transactions?** Call `conn.setAutoCommit(false)`. Run your queries. If they all succeed, call `conn.commit()`. If an exception is thrown, catch it and call `conn.rollback()`.

---

# 🚀 Next Day Preview: Day 29 – Mini Projects
You now know Variables, Object-Oriented Programming, Exception Handling, Collections, File Handling, Multithreading, Functional Programming, and Database Connectivity. You have all the pieces of the puzzle! 🧩

Tomorrow, we put it all together. **Day 29 is Mini Project Day!** We will architect and build real-world, complete applications that combine OOP, Collections, Files, and Databases into professional portfolio pieces. Get ready to build something amazing! 🏗️🌟
