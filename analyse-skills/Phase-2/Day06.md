# Java Fundamentals II - Day 6

## Strings

### What is a String?
A **String is a sequence of characters** and is a **reference type** (immutable).

### Key Concept: Immutability
Once a String is created, it **cannot be changed**. Any modification creates a **new String object**.

```java
String name = "Hello";
name = "World";  // Creates NEW String, doesn't modify existing one
```


### String Creation Methods

#### Method 1: String Literal
```java
String s1 = "Hello";     // Created in String pool
String s2 = "Hello";     // References same object as s1
System.out.println(s1 == s2);  // true (same reference)
```

#### Method 2: Using new Keyword
```java
String s1 = new String("Hello");   // Created on heap
String s2 = new String("Hello");   // Different object on heap
System.out.println(s1 == s2);      // false (different references)
System.out.println(s1.equals(s2)); // true (same content)
```
