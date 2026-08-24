# Object Wrappers and Wrapper Classes 

* Java is object oriented programming languages still has primitive types are not objects
* In ArrayList we cannot use primitive types so we have class that wraps the primitive types are called Wrapper classes
* Wrapper classes have less peformance than primitive types but they do more things
* Byte,Short,Integer,Long,Character,Float,Double,Boolean are Wrapperclasses

## Constructors of Wrapper classes are depreceated
```java

Integer i = new Integer(); // depereceated
```
# valueOf method
```java
Integer i = Integer.valueOf(13);
```

# Boxing
The change of primitives into Wrapper classes is called Boxing
# UnBoxing
The change of Wrapper classes into primitive types is called unboxing

# AutoBoxing and AutoUnboxing
```java
Integer x = 12; // automatically boxed
int y = x; // automatically unboxed
```
The Boxing and UnBoxing works automatically but in bytecode there will be valueOf for boxing and some intValue() like methods for unboxing

# Wrapper classes are References so they can be null;
Don't try to change null to unbox it will throw NullPointer Exception


