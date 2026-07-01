# Java Fundamentals II - Day 10
### StringBuilder Methods

#### 1. append(value)
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(123);
sb.append(true);
System.out.println(sb);  // "Hello123true"
```

#### 2. insert(index, value)
```java
StringBuilder sb = new StringBuilder("Hello");
sb.insert(1, "X");  // "HXello"
```

#### 3. delete(startIndex, endIndex)
```java
StringBuilder sb = new StringBuilder("Hello");
sb.delete(1, 3);    // "Hlo" (removes "el")
```

#### 4. deleteCharAt(index)
```java
StringBuilder sb = new StringBuilder("Hello");
sb.deleteCharAt(1);  // "Hllo"
```

#### 5. setCharAt(index, char)
```java
StringBuilder sb = new StringBuilder("Hello");
sb.setCharAt(0, 'J');  // "Jello"
```
