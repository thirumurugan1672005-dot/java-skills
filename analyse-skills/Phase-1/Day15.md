# Java Fundamentals I - Day 15
## Assignment Operators

Assignment operators are used to assign values to variables.

### Basic Assignment Operator

| Operator | Description | Example |
|----------|-------------|---------|
| `=` | Assigns value to a variable | `int a = 10;` |

### Assignment Operator Examples

```java
int a = 10;        // Assign 10 to variable a
int b = 20;        // Assign 20 to variable b
int c = a + b;     // Assign sum of a and b to c
String name = "John"; // Assign string to name
```

### Important Notes

- Assignment is **right-to-left**: The value on the right is assigned to the variable on the left
- Variables must be **declared** before assignment
- Type must **match** (unless implicit type conversion is allowed)

---

## Compound Assignment Operators

Compound assignment operators combine an arithmetic operation with assignment, making code more concise.

### List of Compound Assignment Operators

| Operator | Equivalent To | Description | Example |
|----------|---------------|-------------|---------|
| `+=` | `a = a + b` | Add and assign | `a += 5;` |
| `-=` | `a = a - b` | Subtract and assign | `a -= 3;` |
| `*=` | `a = a * b` | Multiply and assign | `a *= 2;` |
| `/=` | `a = a / b` | Divide and assign | `a /= 4;` |
| `%=` | `a = a % b` | Modulus and assign | `a %= 3;` |

### Compound Assignment Operator Examples

```java
int a = 10;

a += 5;  // Equivalent to: a = a + 5;  → a = 15
a -= 3;  // Equivalent to: a = a - 3;  → a = 12
a *= 2;  // Equivalent to: a = a * 2;  → a = 24
a /= 4;  // Equivalent to: a = a / 4;  → a = 6
a %= 3;  // Equivalent to: a = a % 3;  → a = 0
```
### Why Use Compound Assignment Operators?

1. **More Concise**: Shorter, cleaner code
2. **More Readable**: Clearly shows the intention
3. **Same Functionality**: Works exactly the same as the expanded form

```java
// Traditional way
b = b + a;

// Compound assignment way (preferred)
b += a;
```

---
