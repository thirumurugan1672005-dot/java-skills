# Data Types
* Java is Strongly Typed language so it must have data types

Integer Data Types

1. C/C++ Integer Data Types are used for powerful precision
2. For 32 bit processer they use 4 bytes and for 16 bit processer they use 2 byte
3. long data type : 8byte for 64 bit proccessor , 4 byte for 32 bit processer

Java have same precision on all machines since range is fixed. They are platform independent

1. Java does not have unsigned types
2. Byte -> toUnSignedInt(b) , toUnsignedLong(b)
3. Long and Integer has also i see Unsigned Division and Remainder
```java
public class Demo{
    public static void main(String[] args){
        byte b = -12;
        System.out.println(Byte.toUnsignedInt(b));
        System.out.println(Integer.divideUnsigned(-12,3));
    }
}
```
1. For Hexadecimals 0x or 0X
2. For binary 0b or 0B
3. for octals with prefix 0

```java
int hex = 0xFF;
int y = 0b1001;
int z = 077;
```

Floating Point numbers

float : 6-7 precisions
double : 15 precisions

0xFF.0p2

0xFf -> hex digit
.0 -> decimal
p2 -> exponent 2
base is always 2
```java
System.out.println(0xFF.0p2);  // 15 * 2 ^ 2 = 15 * 4  = 60
```
*  Floating Point numbers are produced precision errors so it does not use in financial calculations

To Roundoff and Overflow errors 
1. Positive Infinity
2. Negative Infinity
3. Nan

To check Nan we can use 

```java
Double d = Double.NaN;
System.out.println(Double.isNan(d));
System.out.println(Double.POSITVE_INFINITY);
System.out.println(Double.NEGATIVE_INFINITY);
```

## Boolean 
You cannot convert 0 and 1 or any integer into boolean values in java.
