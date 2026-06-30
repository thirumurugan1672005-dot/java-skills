# Java Fundamentals I - Day 20

## Switch Statements

**Switch statements** are used when we need to choose from **a set of values** to execute specific code blocks.

**Better than if-else when checking a single variable against multiple fixed values.**

### Syntax

```java
switch (expression) {
    case value1:
        // Code executes if expression equals value1
        break;
    case value2:
        // Code executes if expression equals value2
        break;
    case value3:
        // Code executes if expression equals value3
        break;
    default:
        // Code executes if expression doesn't match any case
}
```

### Switch Statement Example

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("January");
        break;
    case 2:
        System.out.println("February");
        break;
    case 3:
        System.out.println("March");
        break;
    default:
        System.out.println("Invalid month");
}

// Output: March
```

### Important Points About Switch

1. **break statement**: 
   - Exits the switch block
   - If omitted, execution continues to the next case (fall-through behavior)

   ```java
   int x = 1;
   
   switch (x) {
       case 1:
           System.out.println("One");
           // No break - falls through
       case 2:
           System.out.println("Two");
           break;
       default:
           System.out.println("Other");
   }
   
   // Output: 
   // One
   // Two
   ```

2. **default case**:
   - Optional but recommended
   - Executes if no case matches
   - Similar to else in if-else statements

3. **Expression Types**: 
   - Can be int, char, String, or enum
   - Cannot be boolean, float, or double

4. **Case Values**:
   - Must be constant (not variables)
   - Must be same type as expression

### Switch vs if-else

| Feature | Switch | if-else |
|---------|--------|---------|
| **Best for** | Multiple fixed values | Complex conditions |
| **Readability** | Better for many values | Better for conditions |
| **Type checking** | Value equality | Any boolean expression |
| **Performance** | Slightly faster | Standard |

---
