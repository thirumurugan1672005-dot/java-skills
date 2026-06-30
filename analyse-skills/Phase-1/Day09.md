# Java Fundamentals I - Day 9

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
