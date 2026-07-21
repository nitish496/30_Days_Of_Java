Here is the exact, ultra-refined version inside a single code block. You can easily click the **Copy code** button in the top right corner of the block below and paste it directly into your `notes.md` file on GitHub!

```markdown
# 📅 Day 11 - 2D Arrays

Welcome to Day 11! Today we learn to store data in grids (rows and columns) using **2D Arrays (Matrices)**.
✅ Create | ✅ Input | ✅ Print | ✅ Search | ✅ Min/Max | ✅ Add | ✅ Transpose | ✅ Diagonals

---

# 📖 Quick Intro
A **2D Array** is an array of arrays. Think of it as an Excel spreadsheet.
- **Why use it?** Perfect for game boards, pixel grids, and tabular data.
- **Structure:** `int[][] arr;` accessed by `arr[row][col]`.
- **Traversal:** Requires nested `for` loops.

---

# 🧠 Memory & Syntax
Rows (Y-axis) and Columns (X-axis). Everything starts at index `0`.
- **Create:** `int[][] m = new int[3][3];`
- **Initialize:** `int[][] m = { {1,2}, {3,4} };`
- **Access/Update:** `m[1][0] = 50;` (Overwrites Row 1, Col 0).

---

# =========================================
# 1. Declare and Print
# =========================================
**🎯 Objective:** Read a specific box. | **🤔 Concept:** `[Row][Col]` | **📝 Syntax:** `System.out.println(m[1][2]);`
```java
public class Program1 {
    public static void main(String[] args) {
        int[][] num = { {10, 20}, {30, 40} }; 
        System.out.println("Row 1, Col 0: " + num[1][0]);
    }
}
```
**🖥 Output:** `Row 1, Col 0: 30`
**🔍 Explanation:** Grabs data at row index 1, column index 0.
**🔄 Dry Run:** `num[0][1]` is `20`. `num[1][0]` is `30`.
**💡 Key Points:** First index = Row. Second index = Col.
**⚠️ Mistake:** Out-of-bounds error if index exceeds size.

---

# =========================================
# 2. Take Input
# =========================================
**🎯 Objective:** Read keyboard input. | **🤔 Concept:** Nested loops. | **📝 Syntax:** `m[i][j] = sc.nextInt();`
```java
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) m[i][j] = sc.nextInt();
        }
    }
}
```
**🖥 Output:** (Fills grid with user input).
**🔍 Explanation:** Outer loop `i` locks a row. Inner loop `j` fills columns.
**🔄 Dry Run:** `i=0, j=0` fills `m[0][0]`.
**💡 Key Points:** Outer loop is always the Y-axis (Rows).
**⚠️ Mistake:** Swapping `i` and `j` places data in wrong boxes.

---

# =========================================
# 3. Print 2D Array
# =========================================
**🎯 Objective:** Print as a grid. | **🤔 Concept:** `print` for cols, `println` for rows.
```java
public class Program3 {
    public static void main(String[] args) {
        int[][] m = { {1, 2}, {3, 4} };
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) System.out.print(m[i][j] + " ");
            System.out.println(); // Next line!
        }
    }
}
```
**🖥 Output:** 
`1 2 `
`3 4 `
**🔍 Explanation:** `m.length` is rows. `m[i].length` is cols.
**💡 Key Points:** Use `print()` inside, `println()` outside.
**⚠️ Mistake:** `println` inside creates a giant vertical list.

---

# =========================================
# 4. Find Sum
# =========================================
**🎯 Objective:** Add all numbers. | **🤔 Concept:** Accumulate into `sum`. | **📝 Syntax:** `sum += m[i][j];`
```java
public class Program4 {
    public static void main(String[] args) {
        int[][] m = { {5, 10}, {15, 20} };
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) sum += m[i][j];
        }
        System.out.println("Sum: " + sum);
    }
}
```
**🖥 Output:** `Sum: 50`
**🔍 Explanation:** Adds every box's value to the `sum` variable.
**💡 Key Points:** Initialize `sum` *outside* the loops.
**⚠️ Mistake:** Initializing `sum` inside the outer loop resets it every row!

---

# =========================================
# 5 & 6. Find Largest / Smallest
# =========================================
**🎯 Objective:** Locate extremes. | **🤔 Concept:** Assume `m[0][0]` is the target. Compare. 
```java
public class Program5 {
    public static void main(String[] args) {
        int[][] m = { {12, 45}, {99, 8} };
        int max = m[0][0]; // Assume first is biggest
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) max = m[i][j]; // Use < for Smallest!
            }
        }
        System.out.println("Max: " + max);
    }
}
```
**🖥 Output:** `Max: 99`
**🔍 Explanation:** If current box > `max`, it replaces `max`.
**💡 Key Points:** Always initialize `max`/`min` with `m[0][0]`.
**⚠️ Mistake:** Initializing `max = 0` fails if the grid contains only negative numbers.

---

# =========================================
# 7. Search Element
# =========================================
**🎯 Objective:** Find coordinates. | **🤔 Concept:** Boolean flag + Linear Search.
```java
public class Program7 {
    public static void main(String[] args) {
        int[][] m = { {10, 20}, {40, 50} };
        int target = 50; boolean found = false;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == target) {
                    System.out.println("Found at: " + i + "," + j);
                    found = true; break;
                }
            }
        }
        if (!found) System.out.println("Not found");
    }
}
```
**🖥 Output:** `Found at: 1,1`
**🔍 Explanation:** Matches 50, prints coordinates, flips flag, breaks early.
**⚠️ Mistake:** Putting "Not found" inside the loop prints it for every wrong box.

---

# =========================================
# 8. Add Matrices
# =========================================
**🎯 Objective:** Add identical grids. | **🤔 Concept:** Index-to-index. | **📝 Syntax:** `R[i][j] = A[i][j] + B[i][j];`
```java
public class Program8 {
    public static void main(String[] args) {
        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) res[i][j] = a[i][j] + b[i][j];
        }
    }
}
```
**🖥 Output:** Internally creates `{ {6, 8}, {10, 12} }`.
**🔍 Explanation:** `1+5=6`. Stores directly in `res` grid.
**💡 Key Points:** Matrices MUST be the exact same size.

---

# =========================================
# 9. Transpose Matrix
# =========================================
**🎯 Objective:** Flip rows to columns. | **🤔 Concept:** Swap indices! | **📝 Syntax:** `trans[j][i] = m[i][j];`
```java
public class Program9 {
    public static void main(String[] args) {
        int[][] m = { {1, 2, 3}, {4, 5, 6} }; // 2x3
        int[][] t = new int[3][2];            // Flipped: 3x2
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) t[j][i] = m[i][j]; // Magic Swap!
        }
    }
}
```
**🖥 Output:** Internally creates `{ {1,4}, {2,5}, {3,6} }`.
**🔍 Explanation:** Index `i,j` data moves to `j,i`.
**⚠️ Mistake:** Creating transpose array with original size (`new int[2][3]`) crashes it.

---

# =========================================
# 10. Print Diagonals
# =========================================
**🎯 Objective:** Identify primary diagonal. | **🤔 Concept:** Row perfectly matches Col. | **📝 Syntax:** `if (i == j)`
```java
public class Program10 {
    public static void main(String[] args) {
        int[][] m = { {1, 2}, {3, 4} };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) System.out.print(m[i][j] + " ");
            }
        }
    }
}
```
**🖥 Output:** `1 4 `
**🔍 Explanation:** Only prints when Row equals Col (`0,0` and `1,1`).
**💡 Key Points:** Only works perfectly on square matrices.

---

# 📖 Theory & Complexity

| Operation | Complexity | Reason |
| :--- | :--- | :--- |
| Traversal, Search, Sum, Add, Transpose | `O(R × C)` | Must visit every single box `R` (rows) x `C` (cols). |
| Diagonal | `O(R × C)` or `O(N)` | `O(N)` if optimized to a single loop. |

**Key Methods:** `m.length` (Total Rows) | `m[i].length` (Total Cols in Row) | `Nested Loops` (Navigate Grid).

---

# 🧠 5 Quick Interview Questions
1. **1D vs 2D?** Linear list vs Tabular grid.
2. **Why nested loops?** Outer controls Y-axis (Rows), Inner controls X-axis (Cols).
3. **Matrix Addition rule?** `R[i][j] = A[i][j] + B[i][j]`.
4. **Transpose rule?** `T[j][i] = A[i][j]`.
5. **Diagonal rule?** `i == j`.

---

# ❓ 5 Practice Questions
1. Create a `3x3` matrix of `1`s. 
2. Print the bottom-right element of a grid. 
3. Print the first row only. 
4. Multiply every element in a matrix by `2`.
5. Subtract two matrices.

---

# ⭐ 5 Challenge Programs
1. **Matrix Multiplication** (Dot-product).
2. **Spiral Traversal.**
3. **Magic Square Validation.**
4. **Tic-Tac-Toe Winner Check.**
5. **Island Perimeter Calculator.**

---

> *"Great things are not done by impulse, but by a series of small things brought together." — Vincent Van Gogh*

---

# 🚀 Next Day Preview: Day 12 – ArrayList
Arrays have a massive flaw: **Fixed Size.** Tomorrow, we unlock dynamic memory!
- **What is it?** A resizable array!
- **Core Methods:** `add()`, `get()`, `set()`, `remove()`, `size()`.
```