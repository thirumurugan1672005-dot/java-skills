
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
