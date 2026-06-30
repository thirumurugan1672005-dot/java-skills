
# Java Fundamentals 1 - Day 12
## Introduction to Operators

**What are Operators?**

Operators are special symbols used to perform operations on values and variables. They tell Java what action to perform with the operands.

### Types of Operators in Java

There are **4 main categories** of operators:

1. **Arithmetic Operators** - Mathematical operations
2. **Relational Operators** - Comparison operations
3. **Logical Operators** - Boolean logic operations
4. **Assignment Operators** - Value assignment operations

---

## Arithmetic Operators

Arithmetic operators are used to perform basic mathematical operations on numeric values.

### List of Arithmetic Operators

| Operator | Name | Description | Example | Result |
|----------|------|-------------|---------|--------|
| `+` | Addition | Adds two operands | 12 + 13 | 25 |
| `-` | Subtraction | Subtracts second operand from first | 12 - 2 | 10 |
| `*` | Multiplication | Multiplies two operands | 12 * 2 | 24 |
| `/` | Division | Divides first operand by second | 12 / 2 | 6 |
| `%` | Modulus (Remainder) | Returns remainder after division | 12 % 5 | 2 |

### Arithmetic Operator Examples

```java
int a = 20;
int b = 10;

int sum = a + b;        // 30
int difference = a - b; // 10
int product = a * b;    // 200
int quotient = a / b;   // 2
int remainder = a % b;  // 0

double result = 12.0 / 2.0;  // 6.0 (double division)
```

### Important Notes

- **Integer Division**: When dividing two integers, the result is truncated to an integer
  - `12 / 5 = 2` (not 2.4)
  - `12.0 / 5 = 2.4` (floating point division)

- **Modulus Operator**: Returns the remainder after division
  - `12 % 5 = 2`
  - `20 % 3 = 2`
  - `15 % 5 = 0`

---
