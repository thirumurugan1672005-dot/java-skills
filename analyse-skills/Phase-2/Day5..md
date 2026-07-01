
### 3D Arrays (Three Dimensions)

#### Concept
A 3D array is like a **collection of 2D arrays**.

#### Declaration & Access
```java
int[][][] cube = new int[2][3][4];    // 2 matrices, each 3x4

// Accessing: cube[matrix_index][row_index][column_index]
cube[0][1][2] = 10;
cube[1][2][3] = 20;
```

#### Example
```java
int[][][] array = {
    { {1,2}, {3,4}, {5,6} },
    { {7,8}, {9,10}, {11,12} }
};

// Visualize:
// array[0] = 2D array of 3x2
// array[1] = 2D array of 3x2
```

#### Iterating Through 3D Arrays
```java
for(int i=0; i<array.length; i++) {
    for(int j=0; j<array[i].length; j++) {
        for(int k=0; k<array[i][j].length; k++) {
            System.out.print(array[i][j][k] + " ");
        }
    }
}
```

---
