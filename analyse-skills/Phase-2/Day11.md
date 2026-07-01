# Java Fundamentals II - Day 11
#### 6. reverse()
```java
StringBuilder sb = new StringBuilder("Hello");
sb.reverse();  // "olleH"
```

#### 7. setLength(newLength)
```java
StringBuilder sb = new StringBuilder("Hello");
sb.setLength(3);   // "Hel"
```

#### 8. capacity()
```java
StringBuilder sb = new StringBuilder();
sb.capacity();  // Initial capacity (usually 16)
```

#### 9. toString()
```java
StringBuilder sb = new StringBuilder("Hello");
String result = sb.toString();  // Convert to String
```

### StringBuilder vs StringBuffer
- **StringBuilder**: Not thread-safe, faster (preferred)
- **StringBuffer**: Thread-safe, slower (legacy)
