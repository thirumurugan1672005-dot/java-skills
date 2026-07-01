
#Java Fundamentals - Day 14
## Classes & Objects

### Basic Class Structure

```java
public class Student {
    // Attributes (member variables)
    int rollNo;
    String name;
    
    // Methods
    public void display() {
        System.out.println("Roll: " + rollNo + ", Name: " + name);
    }
}
```

### Creating Objects

```java
// Create instance (object)
Student s1 = new Student();

// Access attributes
s1.rollNo = 101;
s1.name = "John";

// Call methods
s1.display();  // Output: Roll: 101, Name: John
```

### Object vs Class

- **Class**: Blueprint (type definition)
- **Object**: Instance of a class (actual thing)

---
