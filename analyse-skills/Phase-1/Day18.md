# Java Fundamentals I - Day 18

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
