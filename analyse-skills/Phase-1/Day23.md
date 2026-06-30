# Java Fundamentals I - Day 23
### 3. do-while Loop

**Syntax:**
```java
do {
    // Code to execute
} while (condition);
```

**How it works:**
1. Execute code block FIRST
2. Then check condition
3. If true, repeat code block
4. If false, exit loop

**Key difference**: Code executes **at least once** even if condition is false initially.

**Example:**
```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);

// Output:
// 0
// 1
// 2
// 3
// 4
```


**When to use do-while loop:**
- When code **must execute at least once**
- For menu-driven programs
- For input validation (ask user, check, ask again if invalid)

```java
// Input validation example
int choice;

do {
    System.out.println("Enter 1-5: ");
    choice = input.nextInt();
} while (choice < 1 || choice > 5); // Executes at least once
```

---
