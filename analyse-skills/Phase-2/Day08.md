
# Java Fundamentals II - Day 8

#### 6. equals() vs ==

**CRITICAL: Use .equals() for String comparison**
```java
String s1 = new String("Hello");
String s2 = new String("Hello");

s1 == s2;           // false (different references)
s1.equals(s2);      // true (same content)
```

#### 7. compareTo(String)
```java
String s1 = "Apple";
String s2 = "Banana";
int result = s1.compareTo(s2);  // Negative (s1 comes before s2)
```

### Common String Operations

```java
String name = "  John Doe  ";

// Trim spaces
String trimmed = name.trim();  // "John Doe"

// Replace
String replaced = name.replace("John", "Jane");

// Split
String[] parts = "Hello,World,Java".split(",");
// parts = ["Hello", "World", "Java"]

// Contains
boolean has = "Hello".contains("ell");  // true

// StartsWith & EndsWith
boolean starts = "Hello".startsWith("He");   // true
boolean ends = "Hello".endsWith("lo");       // true
```

---
