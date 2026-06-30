# Java Fundamentals I - Day 5
## Variables

A variable is a named storage location that holds a value of a specific data type.

### Variable Declaration

**Syntax**:
```java
dataType variableName;
dataType variableName = initialValue;
```

**Examples**:
```java
int age;                    // Declaration without initialization
int age = 25;              // Declaration with initialization
String name = "John";      // Reference type
double salary = 50000.50;  // Floating point
```

### Rules for Variables in Java

1. **Must declare with a data type**: Java is a **strongly typed language**
2. **Must initialize before use**: Using an uninitialized variable causes a compiler error
3. **Scope matters**: Variables are accessible only within their declared scope
4. **Case-sensitive**: `age` and `Age` are different variables

### Java is a Strongly Typed Language

This means:
- Every variable must have a declared data type
- Type checking is done at compile time
- You cannot assign a value of one type to a variable of an incompatible type without explicit casting
- This ensures type safety and prevents many common errors

### Example:
```java
int x = 100;              // ✅ Correct
String s = "Hello";       // ✅ Correct
int y = "Hello";          // ❌ Error: cannot assign String to int
double d = 10;            // ✅ Correct: implicit conversion from int to double (widening)
byte b = 10;              // ✅ Correct: small enough for byte range
```
