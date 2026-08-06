# lib/

JDBC driver used by the Day 28 exercises. The `.jar` is **not committed** (11 MB binary),
so after a fresh clone you need to download it again:

```bash
curl -L -O --output-dir lib \
  https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.53.2.1/sqlite-jdbc-3.53.2.1.jar
```

## Running a JDBC program

The driver must be on the classpath, so plain `java File.java` will not work:

```bash
java --enable-native-access=ALL-UNNAMED -cp ".:lib/sqlite-jdbc-3.53.2.1.jar" YourFile.java
```

- `-cp` is required. Without it: `SQLException: No suitable driver found`.
- `--enable-native-access=ALL-UNNAMED` is optional. It only silences JDK 25 warnings
  about the driver loading a native library.

## Database

`javadb.db` in the repo root is the SQLite database (also gitignored). Recreate it with:

```bash
sqlite3 javadb.db "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name VARCHAR(50), marks INTEGER);"
```

Connection string from Java, run from the repo root: `jdbc:sqlite:javadb.db`
