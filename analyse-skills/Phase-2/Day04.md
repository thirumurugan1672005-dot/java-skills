# Java Fundamentals II - Day 4
#### Iterating Through 2D Arrays
```java
int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

// Nested traditional for
for(int i=0; i<matrix.length; i++) {
    for(int j=0; j<matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

// Nested enhanced for
for(int[] row : matrix) {
    for(int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

---
