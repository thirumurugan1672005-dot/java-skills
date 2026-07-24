# Strings
Strings are the sequence of Characters . It is available from lang package

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
