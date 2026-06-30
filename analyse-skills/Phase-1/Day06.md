# Java Fundamentals I - Day 6
---

## Comments

Comments are used to explain code and make it more readable. Comments are ignored by the Java compiler and do not affect program execution.

### Single-Line Comments

**Syntax**:
```java
// This is a single-line comment
```

**Usage**:
```java
int x = 10;  // Initialize variable x with value 10
// Calculate the sum
int sum = x + 5;
```

### Multi-Line Comments

**Syntax**:
```java
/* This is a multi-line comment
   It can span multiple lines
   Used for longer explanations */
```

**Usage**:
```java
/*
  This function calculates the sum of two numbers
  Parameters: a and b
  Returns: sum of a and b
 */
int add(int a, int b) {
    return a + b;
}
```

### Documentation Comments

**Syntax**:
```java
/** This is a documentation comment
    Used by Javadoc to generate documentation
    @param name description
    @return description
 */
```

**Usage**:
```java
/**
 * Calculates the sum of two integers
 * @param a the first number
 * @param b the second number
 * @return the sum of a and b
 */
public int add(int a, int b) {
    return a + b;
}
```

### Key Points:
- Comments are ignored by the compiler
- Use meaningful comments to explain "why", not "what"
- Keep comments updated with code changes
- Documentation comments (with `/**`) are used to generate API documentation

---
