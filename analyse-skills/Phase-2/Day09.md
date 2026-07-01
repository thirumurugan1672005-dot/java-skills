

## StringBuilder

### Why StringBuilder?

Since Strings are **immutable**, creating new strings repeatedly is **inefficient**.

```java
// INEFFICIENT: Creates 5 new String objects
String result = "";
result += "H";      // New String object
result += "e";      // New String object
result += "l";      // New String object
result += "l";      // New String object
result += "o";      // New String object
```

### StringBuilder Solution

StringBuilder is a **mutable** alternative to String.

```java
// EFFICIENT: Uses single StringBuilder object
StringBuilder sb = new StringBuilder();
sb.append("H");
sb.append("e");
sb.append("l");
sb.append("l");
sb.append("o");
String result = sb.toString();  // "Hello"
```
