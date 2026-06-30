

# Java Fundamentals I - Day 24

### Loop Comparison

| Feature | for | while | do-while |
|---------|-----|-------|----------|
| **Initialization** | Inside loop | Before loop | N/A |
| **Condition Check** | Before execution | Before execution | After execution |
| **Minimum Executions** | Based on condition | Based on condition | At least 1 |
| **Best for** | Known iterations | Unknown iterations | At least 1 execution |
| **Counter** | Built-in | Manual | Manual |

---

### break Statement

The **break statement** terminates the loop immediately and exits it.

**Syntax:**
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Exit loop when i equals 5
    }
    System.out.println(i);
}

// Output:
// 0
// 1
// 2
// 3
// 4
```

**Used in:**
- Loops (for, while, do-while)
- Switch statements

---
