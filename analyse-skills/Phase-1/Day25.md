# Java Fundamentals I - Day 25
### continue Statement

The **continue statement** skips the current iteration and moves to the next iteration.

**Syntax:**
```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;  // Skip when i equals 2
    }
    System.out.println(i);
}

// Output:
// 0
// 1
// 3
// 4
```

---

## Summary Table: All Operators

| Category | Operators | Purpose |
|----------|-----------|---------|
| **Arithmetic** | +, -, *, /, % | Mathematical operations |
| **Relational** | >, <, >=, <=, ==, != | Comparison (returns boolean) |
| **Logical** | &&, \|\|, ! | Boolean logic operations |
| **Assignment** | = | Assign values |
| **Compound Assignment** | +=, -=, *=, /=, %= | Combined arithmetic and assignment |
| **Increment/Decrement** | ++, -- | Increase/decrease by 1 |

---

## Operator Precedence (Order of Execution)

When multiple operators are used, they follow an order of precedence:

1. **Increment/Decrement** (++, --)
2. **Multiplicative** (*, /, %)
3. **Additive** (+, -)
4. **Relational** (<, >, <=, >=)
5. **Equality** (==, !=)
6. **Logical AND** (&&)
7. **Logical OR** (||)
8. **Assignment** (=, +=, -=, etc.)

**Example:**
```java
int result = 5 + 3 * 2;  // 3 * 2 = 6, then 5 + 6 = 11 (not 16)

int result2 = (5 + 3) * 2; // 5 + 3 = 8, then 8 * 2 = 16 (parentheses change order)
```

---
