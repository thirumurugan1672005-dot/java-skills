# Arithemetic Operations

* One of goal of java is portability which means it produce reproducible results
* At First They impose Strict 64 bit arithemetic
* 80 bit Processors takes time to truncate it
* It was stopped and allowed more number of bits in intermediate operations
* It was strict only when then strictfp keyword was used
* Java !7 : Processors advanced they undergo strict 64 bit arithemetic


## Type Casting Important things i noticed 

1. You cannot cast boolean into integer like Python or Cpp
2. If you cast the one which goes beyond the range of target type the value will change

```java

int x = 256;
byte b = (byte)x;
System.out.println(b);
```
output : 0

# Compound Assignment Operators

Compound Assignment Operators are used to assign but when data types are changed it is coreced to fit

Example :
This code below produce compiler error 
```java
int x = 256;
byte b = x;
```
Example:
The code will compile
```java
int x = 256;
byte b = 0;
b+=x;
```
Reason : b+= x actually becomes b = (int)b+x;

# Increment and Decrement Operator

Increment Operator and Decrement Operators are unary and it increments and decrements by 1

*  ++a : pre-increment : increment and then used it or stored it
*  --a : pre-decrement : decrement and then used it or stored it
*  a++ : post-increment : used the value and then increment
*  a-- :post-decrement : used the value and then decrement


```java
int a = 10;
System.out.println(a++); // prints 10 and a becomes 11
System.out.println(a--); // prints 11 and a becomes 10
System.out.println(++a); // a becomes 11 and prints 11
System.out.println(--a);  // a becomes 10 and prints 10
```

