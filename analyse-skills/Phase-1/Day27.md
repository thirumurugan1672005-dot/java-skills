# Java Fundamentals I - Day 27
---


### Labeled Break Statement

#### Problem: Break Only Exits Inner Loop
```java
for(int i=1; i<=3; i++) {
    for(int j=1; j<=3; j++) {
        if(i == 2 && j == 2) {
            break;  // Only breaks inner loop
        }
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}

// Output:
// (1,1) (1,2) (1,3)
// (2,1)
// (3,1) (3,2) (3,3)
```

#### Solution: Labeled Break
```java
outerLoop: for(int i=1; i<=3; i++) {
    for(int j=1; j<=3; j++) {
        if(i == 2 && j == 2) {
            break outerLoop;  // Breaks BOTH loops
        }
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}

// Output:
// (1,1) (1,2) (1,3)
// (2,1)
```

#### Syntax
```java
labelName: for(...) {
    for(...) {
        if(condition) {
            break labelName;
        }
    }
}
```

---
