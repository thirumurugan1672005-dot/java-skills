# Strings
Strings are the sequence of Unicode Characters . It is available from java.lang package

```java
String s = "Hello World";
String empty  = ""; //Empty String
```
## Substrings
Substrings are part of strings 

Java counts codepoints and code units in string

```java
String s = "HelloWorld";
System.out.println(s.substring(0,3);
```
Example:
  Substring from 0 to 3-1 first to second - 1 

## Concatenation
Concatenation is the form in which two Strings joins to form new String

```java
String s = "Hello";
String t = "World";
String ans = s+t;
System.out.println(ans);
```
```+``` : operator is used to concatenate two strings

For More than one Strings 

1. join method (static)
```java
String s = String.join(",","Hello","World");
```
output: Hello,World

```
As of Java 11 there is repeat method
```
```java
System.out.println("Hello".repeat(3));
```

## Strings are immutable
Example 1
```java
String s = "Hello";
String t = "Hello";
System.out.println(s==t);
```

output : true

For Reference variables if both point to same memory then == operator returns true

String Literals stored in special memory called Constant Pool

Once String Literals intialised it will check from constant pool then only it creates new literal

Example 2
```java
String s = new String("Hello");
String t = new String("Hello");
System.out.println(s==t);
```
It is false here since it is creating two objects of String in heap memory

Strings shared copy of literals change in one affects another for this reason it was made immutable

Example 3

Every Time You create a new String may increases overhead in memory but we dont change string that much .
```java
String t = "Hello";
t = "World"; // new String forms
```

In Strings we cannot change characters inside it : Immutability

Once Literals dont have any objects it automatically eligible for Garbage Collection.
so "Hello" becomes eligible for garbage collection.
