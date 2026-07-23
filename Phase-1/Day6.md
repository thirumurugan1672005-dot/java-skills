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
