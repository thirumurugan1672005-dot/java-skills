#  Java Fundamentals I - Day 26
## Control Flow

### Nested Loops

#### Nested For Loops (2D Iteration)
```java
for(int i=1; i<=3; i++) {
    for(int j=1; j<=3; j++) {
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}

// Output:
// (1,1) (1,2) (1,3)
// (2,1) (2,2) (2,3)
// (3,1) (3,2) (3,3)
```

#### Nested While Loops
```java
int i = 1;
while(i <= 3) {
    int j = 1;
    while(j <= 3) {
        System.out.print(j + " ");
        j++;
    }
    System.out.println();
    i++;
}
```

---
