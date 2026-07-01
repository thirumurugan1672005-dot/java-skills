# Java Fundamentals - Day 13

### How References Work

```java
int[] a = {10, 20, 30};
int[] b = a;  // Both point to SAME array

a[0] = 100;
System.out.println(b[0]);  // Output: 100 (same object!)

// Stack Memory:           // Heap Memory:
// a | ---address--->  | [100, 20, 30]
// b | ---address--->
```

### Creating New Objects

```java
int[] a = {10, 20, 30};
int[] b = new int[]{10, 20, 30};

System.out.println(a == b);  // false (different objects)
System.out.println(a[0] == b[0]);  // true (same values)

// Stack Memory:           // Heap Memory:
// a | ---address1--->  | [10, 20, 30]
// b | ---address2--->  | [10, 20, 30]
```

### Null Reference

```java
String name = null;  // Reference to nothing

System.out.println(name.length());  // NullPointerException!

// Stack Memory:
// name | null (no object)
```

---
