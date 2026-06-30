# Java Fundamentals I - Day 14

## Logical Operators

Logical operators are used to combine multiple boolean conditions. They return a **boolean result** (`true` or `false`).

### List of Logical Operators

| Operator | Name | Description | Example |
|----------|------|-------------|---------|
| `&&` | AND | Returns true if BOTH conditions are true | (a > 5) && (b < 10) |
| `\|\|` | OR | Returns true if AT LEAST ONE condition is true | (a > 5) \|\| (b < 10) |
| `!` | NOT | Returns the opposite boolean value | !(a > 5) |

### Truth Tables

#### AND Operator (&&)

```
A    B    A && B
---  ---  ------
T    T    T
T    F    F
F    T    F
F    F    F
```

**Both conditions must be true for the result to be true.**

#### OR Operator (||)

```
A    B    A || B
---  ---  ------
T    T    T
T    F    T
F    T    T
F    F    F
```

**At least one condition must be true for the result to be true.**

#### NOT Operator (!)

```
A    !A
---  ---
T    F
F    T
```

**The result is the opposite of the condition.**

### Logical Operator Examples

```java
int age = 20;
int salary = 50000;

// AND Operator
if (age > 18 && salary > 40000) {
    System.out.println("Eligible"); // true && true = true
}

// OR Operator
if (age < 18 || salary > 100000) {
    System.out.println("Check further"); // false || false = false
}

// NOT Operator
if (!(age < 18)) {
    System.out.println("Adult"); // !(false) = true
}
```

### Truth Table Examples

```java
// Example with 88 && 12
// 88 is true (non-zero), 12 is true (non-zero)
// Result: true && true = true

// Example with 12 || 13881 <= 12
// (12 || 13881) evaluates to true
// (true <= 12) causes a compilation error (can't compare boolean to int)
```

---
