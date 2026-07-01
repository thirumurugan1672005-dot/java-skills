# Java Fundamentals II - Day 2
#### Accessing Elements
Arrays use **0-based indexing**:
```java
int[] a = {10, 20, 30, 40, 50};
a[0] = 10   // First element
a[2] = 30   // Third element
a[4] = 50   // Last element
```

#### Array Length
```java
int[] a = {10, 20, 30, 40, 50};
a.length   // Returns 5
```

#### Iterating Through Arrays

**Traditional For Loop:**
```java
int[] arr = {1, 2, 4, 7, 14};
for(int i=0; i<arr.length; i++) {
    System.out.println(arr[i]);
}
```

**Enhanced For Loop (For-Each):**
```java
int[] arr = {1, 2, 4, 7, 14};
for(int element : arr) {
    System.out.println(element);  // Direct access to element
}
```


**When to use:**
- Traditional for: When you need index
- Enhanced for: When you only need element value
