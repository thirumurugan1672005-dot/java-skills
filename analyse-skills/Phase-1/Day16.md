
# Java Fundamentals I - Day 16
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
