# Java Operators and Control Flow Statements - Complete Guide

## Table of Contents
1. [Introduction to Operators](#introduction-to-operators)
2. [Arithmetic Operators](#arithmetic-operators)
3. [Relational Operators](#relational-operators)
4. [Logical Operators](#logical-operators)
5. [Assignment Operators](#assignment-operators)
6. [Compound Assignment Operators](#compound-assignment-operators)
7. [Increment and Decrement Operators](#increment-and-decrement-operators)
8. [Control Flow Statements](#control-flow-statements)
9. [Conditional Statements (if-else)](#conditional-statements-if-else)
10. [Switch Statements](#switch-statements)
11. [Looping Statements](#looping-statements)

---



## Assignment Operators

Assignment operators are used to assign values to variables.

### Basic Assignment Operator

| Operator | Description | Example |
|----------|-------------|---------|
| `=` | Assigns value to a variable | `int a = 10;` |

### Assignment Operator Examples

```java
int a = 10;        // Assign 10 to variable a
int b = 20;        // Assign 20 to variable b
int c = a + b;     // Assign sum of a and b to c
String name = "John"; // Assign string to name
```

### Important Notes

- Assignment is **right-to-left**: The value on the right is assigned to the variable on the left
- Variables must be **declared** before assignment
- Type must **match** (unless implicit type conversion is allowed)

---

## Compound Assignment Operators

Compound assignment operators combine an arithmetic operation with assignment, making code more concise.

### List of Compound Assignment Operators

| Operator | Equivalent To | Description | Example |
|----------|---------------|-------------|---------|
| `+=` | `a = a + b` | Add and assign | `a += 5;` |
| `-=` | `a = a - b` | Subtract and assign | `a -= 3;` |
| `*=` | `a = a * b` | Multiply and assign | `a *= 2;` |
| `/=` | `a = a / b` | Divide and assign | `a /= 4;` |
| `%=` | `a = a % b` | Modulus and assign | `a %= 3;` |

### Compound Assignment Operator Examples

```java
int a = 10;

a += 5;  // Equivalent to: a = a + 5;  → a = 15
a -= 3;  // Equivalent to: a = a - 3;  → a = 12
a *= 2;  // Equivalent to: a = a * 2;  → a = 24
a /= 4;  // Equivalent to: a = a / 4;  → a = 6
a %= 3;  // Equivalent to: a = a % 3;  → a = 0
```

### Why Use Compound Assignment Operators?

1. **More Concise**: Shorter, cleaner code
2. **More Readable**: Clearly shows the intention
3. **Same Functionality**: Works exactly the same as the expanded form

```java
// Traditional way
b = b + a;

// Compound assignment way (preferred)
b += a;
```

---

## Increment and Decrement Operators

These operators are used to increase or decrease a variable's value by 1.

### Types of Increment/Decrement Operators

| Operator | Name | Description |
|----------|------|-------------|
| `++` | Increment | Increases value by 1 |
| `--` | Decrement | Decreases value by 1 |

### Pre vs Post Increment/Decrement

#### Pre-Increment (++a)

**The variable is incremented FIRST, then the value is used.**

```java
int a = 10;
int b = ++a;  // a is incremented to 11, then b = 11
System.out.println(a); // Output: 11
System.out.println(b); // Output: 11
```

#### Post-Increment (a++)

**The current value is used FIRST, then the variable is incremented.**

```java
int a = 10;
int b = a++;  // b = 10, then a is incremented to 11
System.out.println(a); // Output: 11
System.out.println(b); // Output: 10
```

#### Pre-Decrement (--a)

**The variable is decremented FIRST, then the value is used.**

```java
int a = 10;
int b = --a;  // a is decremented to 9, then b = 9
System.out.println(a); // Output: 9
System.out.println(b); // Output: 9
```

#### Post-Decrement (a--)

**The current value is used FIRST, then the variable is decremented.**

```java
int a = 10;
int b = a--;  // b = 10, then a is decremented to 9
System.out.println(a); // Output: 9
System.out.println(b); // Output: 10
```

### Complete Example

```java
int a = 12;

System.out.println(a++);    // Output: 12 (then a becomes 13)
System.out.println(a);      // Output: 13

System.out.println(++a);    // Output: 14 (then a is 14)

System.out.println(a--);    // Output: 14 (then a becomes 13)
System.out.println(a);      // Output: 13

System.out.println(--a);    // Output: 12 (then a is 12)
```

### Key Differences

```
Pre-Increment (++a):   Increment first, then use
Post-Increment (a++):  Use first, then increment
Pre-Decrement (--a):   Decrement first, then use
Post-Decrement (a--):  Use first, then decrement
```

---

## Control Flow Statements

Control flow statements control the order in which statements are executed in a program. They allow you to create programs that can make decisions and repeat actions.

### Types of Control Flow Statements

1. **Conditional Statements** - if, if-else, else-if, switch
2. **Looping Statements** - for, while, do-while
3. **Jump Statements** - break, continue

---

## Conditional Statements (if-else)

Conditional statements execute code blocks based on whether a condition is **true** or **false**.

### 1. Simple if Statement

**Syntax:**
```java
if (condition) {
    // Code executes if condition is true
}
```

**Example:**
```java
int age = 20;

if (age >= 18) {
    System.out.println("You are an adult"); // Executes because age >= 18 is true
}
```

### 2. if-else Statement

**Syntax:**
```java
if (condition) {
    // Code executes if condition is true
} else {
    // Code executes if condition is false
}
```

**Important**: An **if cannot exist without else** in some programming contexts, but Java allows standalone if. However, **else can exist without if** is not allowed - else must always follow an if.

**Example:**
```java
int day = 5;

if (day == 1) {
    System.out.println("Monday");
} else {
    System.out.println("Not Monday");
}
```

### 3. else-if Statement

**Used when we need to check MORE THAN ONE condition.**

**Syntax:**
```java
if (condition1) {
    // Code executes if condition1 is true
} else if (condition2) {
    // Code executes if condition2 is true
} else if (condition3) {
    // Code executes if condition3 is true
} else {
    // Code executes if all conditions are false
}
```

**Example:**
```java
int day = 3;

if (day == 1) {
    System.out.println("Monday");
} else if (day == 2) {
    System.out.println("Tuesday");
} else if (day == 3) {
    System.out.println("Wednesday"); // This executes
} else if (day == 4) {
    System.out.println("Thursday");
} else {
    System.out.println("Other day");
}
```

### 4. Nested if Statements

**Multiple if statements inside another if statement.**

```java
int age = 25;
int salary = 50000;

if (age >= 18) {
    if (salary >= 40000) {
        System.out.println("Eligible for loan");
    } else {
        System.out.println("Salary too low");
    }
} else {
    System.out.println("Too young");
}
```

### 5. if-else with Logical Operators

```java
int a = 10;
int b = 20;

if (a > 5 && b > 15) {
    System.out.println("Both conditions are true");
}

if (a > 15 || b > 15) {
    System.out.println("At least one condition is true");
}

if (!(a > 15)) {
    System.out.println("a is not greater than 15");
}
```

---

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

### Loop Comparison

| Feature | for | while | do-while |
|---------|-----|-------|----------|
| **Initialization** | Inside loop | Before loop | N/A |
| **Condition Check** | Before execution | Before execution | After execution |
| **Minimum Executions** | Based on condition | Based on condition | At least 1 |
| **Best for** | Known iterations | Unknown iterations | At least 1 execution |
| **Counter** | Built-in | Manual | Manual |

---

### break Statement

The **break statement** terminates the loop immediately and exits it.

**Syntax:**
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Exit loop when i equals 5
    }
    System.out.println(i);
}

// Output:
// 0
// 1
// 2
// 3
// 4
```

**Used in:**
- Loops (for, while, do-while)
- Switch statements

---

### continue Statement

The **continue statement** skips the current iteration and moves to the next iteration.

**Syntax:**
```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;  // Skip when i equals 2
    }
    System.out.println(i);
}

// Output:
// 0
// 1
// 3
// 4
```

---

## Summary Table: All Operators

| Category | Operators | Purpose |
|----------|-----------|---------|
| **Arithmetic** | +, -, *, /, % | Mathematical operations |
| **Relational** | >, <, >=, <=, ==, != | Comparison (returns boolean) |
| **Logical** | &&, \|\|, ! | Boolean logic operations |
| **Assignment** | = | Assign values |
| **Compound Assignment** | +=, -=, *=, /=, %= | Combined arithmetic and assignment |
| **Increment/Decrement** | ++, -- | Increase/decrease by 1 |

---

## Operator Precedence (Order of Execution)

When multiple operators are used, they follow an order of precedence:

1. **Increment/Decrement** (++, --)
2. **Multiplicative** (*, /, %)
3. **Additive** (+, -)
4. **Relational** (<, >, <=, >=)
5. **Equality** (==, !=)
6. **Logical AND** (&&)
7. **Logical OR** (||)
8. **Assignment** (=, +=, -=, etc.)

**Example:**
```java
int result = 5 + 3 * 2;  // 3 * 2 = 6, then 5 + 6 = 11 (not 16)

int result2 = (5 + 3) * 2; // 5 + 3 = 8, then 8 * 2 = 16 (parentheses change order)
```

---

## Real-World Examples

### Example 1: Leap Year Checker

```java
int year = 2024;

if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
    System.out.println("Leap year");
} else {
    System.out.println("Not a leap year");
}
```

### Example 2: Grade Calculator using Switch

```java
int marks = 85;
char grade;

if (marks >= 90) grade = 'A';
else if (marks >= 80) grade = 'B';
else if (marks >= 70) grade = 'C';
else if (marks >= 60) grade = 'D';
else grade = 'F';

switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Good!");
        break;
    default:
        System.out.println("Need improvement");
}
```

### Example 3: Menu-Driven Program with do-while

```java
int choice;
Scanner input = new Scanner(System.in);

do {
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
    choice = input.nextInt();
    
    switch (choice) {
        case 1:
            System.out.println("Adding numbers...");
            break;
        case 2:
            System.out.println("Subtracting numbers...");
            break;
        case 3:
            System.out.println("Multiplying numbers...");
            break;
        case 4:
            System.out.println("Thank you!");
            break;
        default:
            System.out.println("Invalid choice");
    }
} while (choice != 4);
```

---

**Master these operators and control flow statements, and you'll have a solid foundation for Java programming! Practice with different combinations to develop proficiency.** 💪
