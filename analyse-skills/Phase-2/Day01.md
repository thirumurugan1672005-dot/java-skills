# Java Fundamentals II - Day 1
## Arrays

### What is an Array?
An array is a collection of variables of the same type stored in **contiguous memory locations**. Arrays are **reference types** (stored on heap, not stack).

### 1D Arrays (Single Dimension)

#### Declaration
```java
int[] arr;        // Declare array (reference only, not created yet)
int arr[];        // Alternative syntax (avoid this)
```

#### Initialization
```java
// Method 1: With size (default values: 0 for int, null for objects)
int[] arr = new int[5];

// Method 2: With values (size determined automatically)
int[] arr = {10, 20, 30, 40, 50};

// Method 3: New + values
int[] arr = new int[]{10, 20, 30, 40, 50};
```

