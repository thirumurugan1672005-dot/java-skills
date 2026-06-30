# Java Fundamentals I - Day 19

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
