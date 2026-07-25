# Strings 

# Testing Equality of Strings 

* == : checks whether the Strings are in same location or not
* equals()  method was used to check whether two values are same or not

```java

String s = "Hello";
System.out.println(s.equals("Hello"));
```
# Empty Strings and Null Strings

## Empty Strings 
Empty Strings are strings which has length 0 namely ""

you can check by 
```java
 String s = "";
System.out.println(s.length()==0);
```

## Null Strings 
* Null Strings means it does not hold anything not even empty string
* Instead it holds null
* You cannot access anything from here

```java
String s = null;
System.out.println(s==null);
```

# Code Points and Code units
String Code Points are always start at zero.


1. Code Point : Code points given U+0000 to U+FFFF was basic multilingual plane :-> 1 code unit
2. Code Point : Code points given U+10000 to U+1FFFF was supplementary code plane :-> 2 code units

Code Point
1. Length :
```java
int trueLemgth = "Hello".codePointCount(0,"Hello".length());
```
2. i th codepoint
```java
int index = "Hello".offSetByCodePoint(0,i);
int codepoint = "Hello".codePointAt(index);
```

Code Unit
1. Length
```java
int len = "Hello".length();
```

2. ith code unit

```java
char c = s.charAt(i);
```

Building Code points array

```java
int[]codePoints = str.codepoints.toArray();
String s = new String(codePoints,0,codePoints.length);
```

Code points into String
```java
String s = Character.toString(0x0000);
```

SupplementaryCodePoint check

* isSupplementaryCodePoint()

