# Java Fundamentals I - Day 28

### Labeled Continue Statement

#### Problem: Continue Only Skips Inner Loop Iteration
```java
for(int i=1; i<=3; i++) {
    for(int j=1; j<=3; j++) {
        if(i == 2 && j == 2) {
            continue;  // Skips to next j
        }
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}

// Output:
// (1,1) (1,2) (1,3)
// (2,1) (2,3)
// (3,1) (3,2) (3,3)
```

#### Solution: Labeled Continue
```java
outerLoop: for(int i=1; i<=3; i++) {
    for(int j=1; j<=3; j++) {
        if(i == 2 && j == 2) {
            continue outerLoop;  // Skips to next i
        }
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}

// Output:
// (1,1) (1,2) (1,3)
// (3,1) (3,2) (3,3)
```

---
