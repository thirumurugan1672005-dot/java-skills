# Java Fundamentals - Day 22
---



### 2. while Loop

**Syntax:**
```java
while (condition) {
    // Code to execute repeatedly
}
```

**How it works:**
1. Check if condition is true
2. If true, execute code block
3. Go back to step 1
4. If false, exit loop

**Important**: When using while, you **don't know the number of iterations** in advance.

**Example:**
```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}

// Output:
// 0
// 1
// 2
// 3
// 4
```

**When to use while loop:**
- When you **don't know** how many times the loop will execute
- When the loop continues based on a **condition, not a counter**
- When reading user input until a specific condition

---
