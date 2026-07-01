# Java Fundamentals II - Day 3
---

### 2D Arrays (Two Dimensions)

#### Concept
Think of a 2D array as a **table with rows and columns**.

#### Declaration & Initialization
```java
// Method 1: Size only
int[][] matrix = new int[3][4];    // 3 rows, 4 columns

// Method 2: With values
int[][] matrix = {
    {1, 2, 3, 4},
    {2, 3, 4, 5},
    {3, 4, 5, 6}
};

// Visualization:
//     [0]  [1]  [2]  [3]
// [0]  1    2    3    4
// [1]  2    3    4    5
// [2]  3    4    5    6
```

#### Accessing Elements
```java
int[][] matrix = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}};

matrix[0][2] = 3    // Row 0, Column 2
matrix[1][1] = 3    // Row 1, Column 1
matrix[2][3] = 6    // Row 2, Column 3
```
