# BitWise Operators

Bitwise Operators are operators work on bit level on integers

& : bitwise and 

| : bitwise or

~ : bitwise not

```java

int n = 4;

int thirdBitFromRight = (n & 0b100)/0b100;
System.out.println(thirdBitFromRight);

```

## Shift Operators

```
<< : left shift : shift leftward

>> : right shift : shift rightward
```

```java
int n = 13; // 1101
// 1101 << 1 = 11010 
int x = n << 1;
System.out.println(x);// prints 28
int y = n >> 2;
// 1101 >> 2 = 0110
System.out.println(y);// 12
```

* Right hand Operand will modulo 32 unless left hand side data type is long

# Operators heirarchy
```
1. [] . () (method call)
2. ! ~ ++ -- +(unary) -(unary) (cast)  new
3. * / %
4. + -
5. << >> >>>
6. < <= > >= instanceof
7. == !=
8. &
9. ^
10. |
11. &&
12. ||
13. ?:
14. Compiund assignment operators
```
