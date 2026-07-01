# Java Fundamentals II - Day 7
### Important String Methods

#### 1. length()
```java
String s = "Hello";
int len = s.length();  // Returns 5
```

#### 2. charAt(index)
```java
String s = "Hello";
char c = s.charAt(0);  // 'H'
char c = s.charAt(1);  // 'e'
```

#### 3. substring(startIndex, endIndex)
```java
String s = "Hello";
String sub = s.substring(0, 3);  // "Hel" (includes 0, excludes 3)
String sub = s.substring(2);     // "llo" (from index 2 to end)
```

#### 4. indexOf(char/String)
```java
String s = "Hello";
int index = s.indexOf('l');      // 2 (first occurrence)
int index = s.indexOf("ll");     // 2
int index = s.indexOf('x');      // -1 (not found)
```

#### 5. toUpperCase() & toLowerCase()
```java
String s = "Hello";
String upper = s.toUpperCase();  // "HELLO"
String lower = s.toLowerCase();  // "hello"
```
