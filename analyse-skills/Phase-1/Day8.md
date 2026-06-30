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
