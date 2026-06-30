
# Java Fundamentals I - Day 21
## Looping Statements

Looping statements allow you to execute a block of code **repeatedly** as long as a condition is true.

### Types of Loops

1. **for loop** - Used when you **know the number of iterations**
2. **while loop** - Used when you **don't know** the number of iterations
3. **do-while loop** - Executes at least once, then checks condition

---

### 1. for Loop

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // Code to execute repeatedly
}
```

**How it works:**
1. **Initialization** - Executes once at the beginning
2. **Condition Check** - Checked before each iteration
3. **Code Execution** - If condition is true, code block executes
4. **Increment/Decrement** - Happens after each iteration
5. **Repeat** - Goes back to step 2

**Example:**
```java
// Print numbers 0 to 5
for (int i = 0; i <= 5; i++) {
    System.out.println(i);
}

// Output:
// 0
// 1
// 2
// 3
// 4
// 5
```

**When to use for loop:**
- When you **know the number of iterations** in advance
- When you need to **iterate a specific number of times**
- When you need **loop counter** (index)

---
