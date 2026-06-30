# Java Fundamentals I - Day 3
## Type Conversion

Type conversion in Java involves converting one data type to another. There are two main categories:

### 1. Implicit Type Conversion (Widening/Lossless)

**Definition**: Automatic conversion from a smaller data type to a larger data type.

**No data loss occurs** because the target type can hold all values of the source type.

**Conversion Path** (from smaller to larger):
```
byte → short → int → long → float → double
```

**Examples:**
```java
byte b = 10;
int x = b;           // Implicit: byte to int (no explicit cast needed)

int num = 100;
long y = num;        // Implicit: int to long

long l = 12345L;
double d = l;        // Implicit: long to double
```

### 2. Explicit Type Conversion (Narrowing/Lossy)

**Definition**: Manual conversion from a larger data type to a smaller data type.

**Data loss CAN occur** because the target type may not be able to hold all values of the source type.

**Requires explicit casting** using the syntax: `(targetType)`

**Examples:**
```java
int x = 1243;
byte y = (int)x;     // Explicit cast: int to byte (may lose data)

long value = 12345L;
int result = (int)value;  // Explicit cast: long to int

double d = 3.14159;
int i = (int)d;      // Explicit cast: double to int (loses decimal part)
