# Java Programming Fundamentals - Complete Guide

## Table of Contents
1. [Introduction](#introduction)
2. [JVM, JDK, and JRE](#jvm-jdk-and-jre)
3. [Data Types](#data-types)
4. [Type Conversion](#type-conversion)
5. [Variables](#variables)
6. [Comments](#comments)
7. [Reserved Keywords](#reserved-keywords)
8. [Naming Rules for Variables](#naming-rules-for-variables)
9. [Classes and File Structure](#classes-and-file-structure)
10. [How Java Runs](#how-java-runs)

---

## Introduction

**Java is a Programming Language Designed for: "Write Once, Run Everywhere"**

Java is a powerful, object-oriented programming language created to be platform-independent. This means that code written in Java can run on any machine that has the Java Virtual Machine (JVM) installed, regardless of the operating system or hardware.

### Key Features:
- Everything in Java is written inside a file (typically `.txt` or `.java`)
- Each file has a different file format
- Java Virtual Machine executes the compiled Java byte code
- Platform-independent execution across Windows, Linux, macOS, etc.

---

## JVM, JDK, and JRE

Understanding the difference between these three components is crucial for Java development.

### JVM (Java Virtual Machine)
- **Purpose**: Executes compiled Java code (byte code)
- **Functionality**: Acts as an abstract computing machine that enables a computer to run Java programs and programs written in other languages that are compiled to Java bytecode
- **Key Point**: JVM is what makes Java platform-independent

### JRE (Java Runtime Environment)
- **Purpose**: Provides the environment needed to run Java applications
- **Contains**: 
  - JVM (Java Virtual Machine)
  - Java libraries (standard library)
  - Other components necessary for running Java programs
- **Use Case**: For end users who want to run Java applications (not development)

### JDK (Java Development Kit)
- **Purpose**: Complete development environment for Java developers
- **Contains**: 
  - JRE (Java Runtime Environment)
  - JVM (Java Virtual Machine)
  - Compiler (javac) - converts `.java` to `.class`
  - Development tools and libraries
  - Documentation
- **Use Case**: For developers who need to write, compile, and test Java code

### The Relationship:
```
JDK = JRE + Development Tools (compiler, debugger, etc.)
JRE = JVM + Libraries
```

---

## Data Types

Java has **8 primitive data types** that store values directly in stack memory.

### Primitive Data Types

| Type | Size | Range | Example |
|------|------|-------|---------|
| **byte** | 8 bits | -128 to 127 | `byte b = 50;` |
| **short** | 16 bits | -32,768 to 32,767 | `short s = 1000;` |
| **int** | 32 bits | -2,147,483,648 to 2,147,483,647 | `int x = 100000;` |
| **long** | 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `long y = 1243L;` |
| **float** | 32 bits | Single-precision floating point | `float f = 3.14f;` |
| **double** | 64 bits | Double-precision floating point | `double d = 3.14159;` |
| **boolean** | 1 bit | true or false (NOT 0 or 1) | `boolean isValid = true;` |
| **char** | 16 bits | Unicode characters (0 to 65,535) | `char c = 'A';` |

### Key Points About Primitives:
- **Stored in Stack**: Primitives store their value directly in stack memory
- **Fixed Size**: Each primitive has a fixed size
- **Performance**: Faster than reference types because they are stored directly in memory
- **Memory Efficient**: Require less memory compared to objects

### Boolean Type:
- Only stores `true` or `false`
- Java does NOT allow implicit conversion from integer (0, 1) to boolean
- `(0,1)` is NOT boolean - it's an integer

### Character Type:
- `char` is 16-bit Unicode
- Can store any character from the Unicode character set
- Example: `char ch = 'A';` or `char ch = '\u0041';` (Unicode representation)

---

## Type Conversion

Type conversion in Java involves converting one data type to another. There are two main categories:

### 1. Implicit Type Conversion (Widening/Lossless)

**Definition**: Automatic conversion from a smaller data type to a larger data type.

**No data loss occurs** because the target type can hold all values of the source type.

**Conversion Path** (from smaller to larger):
```
byte → short → int → long → float → double
```

**Examples:**
```java
byte b = 10;
int x = b;           // Implicit: byte to int (no explicit cast needed)

int num = 100;
long y = num;        // Implicit: int to long

long l = 12345L;
double d = l;        // Implicit: long to double
```

### 2. Explicit Type Conversion (Narrowing/Lossy)

**Definition**: Manual conversion from a larger data type to a smaller data type.

**Data loss CAN occur** because the target type may not be able to hold all values of the source type.

**Requires explicit casting** using the syntax: `(targetType)`

**Examples:**
```java
int x = 1243;
byte y = (int)x;     // Explicit cast: int to byte (may lose data)

long value = 12345L;
int result = (int)value;  // Explicit cast: long to int

double d = 3.14159;
int i = (int)d;      // Explicit cast: double to int (loses decimal part)
```

### Important: Java's Type Strictness

**Java does NOT allow implicit type conversion from larger to smaller types.**

Even though the programmer might know that a value is small enough to fit, Java requires explicit casting:

```java
long L = 100;
byte b = L;          // ❌ ERROR: incompatible types (cannot convert long to byte)
byte b = (byte)L;    // ✅ CORRECT: explicit cast required
```

### Type Promotion in Operations

When performing operations between different types, Java automatically promotes operands to a compatible type.

**Important**: When adding two bytes, they are promoted to `int`:

```java
byte b1 = 127;
byte b2 = 127;
byte result = b1 + b2;  // ❌ ERROR: int cannot fit in byte
byte result = (byte)(b1 + b2);  // ✅ CORRECT: explicit cast needed
```

**Why?** The result of `b1 + b2` is `int` because:
- The result might exceed byte range (127)
- Java promotes to a larger type for safety
- Must explicitly cast back to byte if needed

### Lossless vs. Lossy Conversion Summary

| Category | Direction | Data Loss? | Implicit Allowed? | Example |
|----------|-----------|------------|-------------------|---------|
| Widening (Implicit) | small → large | No | Yes | `byte → int` |
| Narrowing (Explicit) | large → small | Possible | No | `int → byte` |

---

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

## Reserved Keywords

Reserved keywords are words that have special meaning in Java and **cannot be used as variable names, class names, or method names**.

### List of Reserved Keywords

```
abstract    assert      boolean     break       byte        case
catch       char        class       const       continue    default
do          double      else        enum        extends     final
finally     float       for         goto        if          implements
import      instanceof  int         interface   long        native
new         package     private     protected   public      return
short       static      strictfp    super       switch      synchronized
this        throw       throws      transient   try         void
volatile    while
```

### Important Reserved Keywords Explained

| Keyword | Purpose |
|---------|---------|
| `public` | Access modifier - accessible from anywhere |
| `private` | Access modifier - accessible only within the class |
| `protected` | Access modifier - accessible within package and subclasses |
| `static` | Belongs to the class, not to instances |
| `final` | Cannot be modified or overridden |
| `abstract` | Must be implemented by subclasses |
| `class` | Declares a class |
| `interface` | Declares an interface |
| `extends` | Inheritance from a class |
| `implements` | Implementation of an interface |
| `new` | Creates an instance of a class |
| `this` | Reference to current object |
| `super` | Reference to parent class |
| `try/catch/finally` | Exception handling |
| `import` | Imports classes/packages |
| `package` | Groups related classes |

### Example of Reserved Keywords:
```java
// ❌ WRONG - 'class' is a reserved keyword
int class = 10;

// ✅ CORRECT
int myClass = 10;

// ❌ WRONG - 'public' is a reserved keyword
String public = "hello";

// ✅ CORRECT
public String myVariable = "hello";
```

---

## Naming Rules for Variables

Java has specific rules and conventions for naming variables, classes, and methods.

### Rules (Mandatory)

1. **Start with a letter, underscore (_), or dollar sign ($)**
   - ✅ `int age;`
   - ✅ `int _age;`
   - ✅ `int $age;`
   - ❌ `int 1age;` (starts with digit)

2. **Cannot start with a digit**
   - ❌ `int 10x;`
   - ✅ `int x10;`

3. **Can contain letters, digits, underscores, and dollar signs**
   - ✅ `int my_age_2023;`
   - ✅ `int $salary;`
   - ❌ `int my-age;` (hyphens not allowed)
   - ❌ `int my age;` (spaces not allowed)

4. **Cannot use spaces**
   - ❌ `int my age;`
   - ✅ `int myAge;`

5. **Cannot use reserved keywords**
   - ❌ `int class;`
   - ✅ `int myClass;`

6. **Case-sensitive**
   - `age` and `Age` are different variables
   - `name` and `Name` are different variables

### Conventions (Recommended Best Practices)

1. **Variable Names**: Use camelCase (start with lowercase)
   ```java
   int studentAge;
   String firstName;
   boolean isActive;
   ```

2. **Class Names**: Use PascalCase (start with uppercase)
   ```java
   class Student { }
   class BankAccount { }
   class ShoppingCart { }
   ```

3. **Constants**: Use ALL_CAPS with underscores
   ```java
   final int MAX_SIZE = 100;
   final double PI = 3.14159;
   final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
   ```

4. **Method Names**: Use camelCase (start with lowercase)
   ```java
   void calculateSum() { }
   int getAge() { }
   boolean isValid() { }
   ```

5. **Be Descriptive**: Use meaningful names
   - ❌ `int x;`
   - ✅ `int studentAge;`

### Summary Table

| Category | Rule | Example |
|----------|------|---------|
| Variables | camelCase, start with letter/_/$ | `myVariable`, `_count`, `$amount` |
| Classes | PascalCase, start with uppercase | `Student`, `BankAccount` |
| Constants | ALL_CAPS with underscores | `MAX_SIZE`, `PI` |
| Methods | camelCase, start with lowercase | `calculateSum()`, `getAge()` |
| Packages | lowercase, separated by dots | `com.example.myapp` |

---

## Classes and File Structure

Java is an object-oriented programming language, and everything in Java is organized inside classes.

### Key Principle: Everything in Java is in a Class

**This is fundamental**: All code, variables, and methods in Java must be written inside a class.

### Class Declaration

```java
public class ClassName {
    // Class members (variables, methods, etc.)
}
```

### File Structure Rules

1. **Exactly ONE public class per file**
   - A Java source file can have multiple classes, but only ONE can be public

2. **File name MUST match the public class name**
   - If the public class is `Student`, the file must be named `Student.java`
   - File names are case-sensitive

3. **File extension must be `.java`**
   - `Student.java` (correct)
   - `Student.txt` (incorrect)

### Example Structure

**File: Student.java**
```java
public class Student {
    // This is the public class
    // File MUST be named Student.java
    
    int age;
    String name;
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

**File: Utils.java** (optional non-public class in same file)
```java
public class Utils {
    // Public class - file must be named Utils.java
}

class Helper {
    // Non-public class - can be in any file, but conventionally in its own file
}
```

### Class Structure

```java
public class Employee {
    // 1. Member Variables (properties)
    int employeeId;
    String name;
    double salary;
    
    // 2. Constructor (initializes objects)
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    // 3. Methods (behavior/functionality)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
    // 4. Getter/Setter methods
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
}
```

### Characteristics of Classes

- **Encapsulation**: Bundle data and methods together
- **Reusability**: Classes can be instantiated multiple times
- **Organization**: Logical grouping of related functionality
- **Modularity**: Break complex problems into manageable pieces

---

## How Java Runs

Understanding how Java code is executed is crucial for becoming a proficient Java developer.

### The Java Execution Process

#### Step 1: Write Java Code
```java
// File: HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Step 2: Compilation (Source Code → Byte Code)
```
javac HelloWorld.java
```

**Process**:
- The Java **compiler (javac)** reads the `.java` source file
- Checks for syntax errors and type safety
- Converts the Java code into **bytecode** (intermediate form)
- Creates a `.class` file containing bytecode

**Output**: `HelloWorld.class`

**Bytecode**: 
- Platform-independent intermediate code
- Not directly executable by processor
- Must be interpreted/compiled by JVM
- Same bytecode can run on any machine with JVM installed

#### Step 3: Execution (Byte Code → Machine Instructions)
```
java HelloWorld
```

**Process**:
- JVM reads the `.class` file (bytecode)
- JVM interprets bytecode into machine-specific instructions
- OS executes the machine instructions
- Output is displayed

### The Compilation and Execution Flow

```
Source Code (.java)
        ↓
    [Compiler]
        ↓
  Bytecode (.class)
        ↓
     [JVM] (JRE)
        ↓
Machine Instructions
        ↓
    [OS/Processor]
        ↓
      Output
```

### Key Points

1. **Compilation**: Happens once per source file
   - Converts human-readable code to bytecode
   - Checks for errors before runtime
   - Creates `.class` files

2. **Bytecode**: 
   - Platform-independent
   - Intermediate representation
   - Same bytecode works on any system with JVM

3. **JVM Execution**: Happens each time you run the program
   - JVM interprets bytecode
   - Handles memory management
   - Provides security features
   - Converts to platform-specific machine code

4. **Platform Independence**:
   - Write once → Compile once
   - Run anywhere (with JVM)
   - No need to recompile for different OS

### Why This Design?

```
Traditional Languages:
Source Code → Compilation → Executable (Windows-specific)
Source Code → Compilation → Executable (Linux-specific)
Source Code → Compilation → Executable (macOS-specific)

Java Approach:
Source Code → Compilation → Bytecode (Universal)
Bytecode → [Windows JVM] → Runs on Windows
Bytecode → [Linux JVM] → Runs on Linux
Bytecode → [macOS JVM] → Runs on macOS
```

This is what makes Java's slogan true: **"Write Once, Run Everywhere"**

---

## Summary Diagram

```
┌─────────────────────────────────────────────────────────┐
│                    JAVA PROGRAM FLOW                    │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  1. Write Code (HelloWorld.java)                        │
│     ↓                                                   │
│  2. Compile with javac                                 │
│     ↓                                                   │
│  3. Generate Bytecode (HelloWorld.class)               │
│     ↓                                                   │
│  4. Execute with java                                  │
│     ↓                                                   │
│  5. JVM interprets bytecode                            │
│     ↓                                                   │
│  6. Produces Output                                     │
│                                                         │
└─────────────────────────────────────────────────────────┘
```

---

## Quick Reference

### Primitive Data Types at a Glance
- **Numeric Integer Types**: byte, short, int, long
- **Numeric Floating-Point Types**: float, double
- **Boolean Type**: boolean (true/false only)
- **Character Type**: char (16-bit Unicode)

### Type Conversion Quick Rules
- **Implicit (Automatic)**: small type → large type (widening)
- **Explicit (Manual)**: large type → small type (narrowing, requires casting)

### Key Terminology
- **JDK**: Complete development environment (includes JRE + tools)
- **JRE**: Runtime environment (includes JVM + libraries)
- **JVM**: Virtual machine that executes bytecode
- **Bytecode**: Platform-independent intermediate code
- **Primitive**: Data type that stores value directly (not an object)

### Important Concepts
- Java is **strongly typed** - all variables must have declared types
- Java is **platform-independent** - same bytecode runs everywhere
- Java is **object-oriented** - everything is in classes
- Type **promotion** happens automatically in operations
- Reserved **keywords** cannot be used as identifiers

---

**This guide covers the fundamental concepts needed to start programming in Java. Master these concepts before moving on to more advanced topics like object-oriented programming, collections, exception handling, and design patterns.**
