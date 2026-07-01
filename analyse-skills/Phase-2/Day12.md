# Java Fundamentals II - Day 12
## Memory Concepts

### Stack vs Heap

| Feature | Stack | Heap |
|---------|-------|------|
| Size | Small, limited | Large |
| Speed | Fast | Slower |
| Memory Management | Automatic | Garbage collection |
| Lifetime | Until method ends | Until no references |
| Usage | Primitive variables, references | Objects, arrays |

### Primitive Types (Stack Storage)

```java
int x = 10;
int y = 20;

// Stack Memory:
// x | 10
// y | 20
```

### Reference Types (Heap Storage)

```java
String name = "John";
int[] arr = {1, 2, 3};

// Stack Memory:           // Heap Memory:
// name | ---address--->  | "John" (String object)
// arr  | ---address--->  | [1, 2, 3] (Array object)
```
