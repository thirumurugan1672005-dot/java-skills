# Object Constructors

In Object Oriented Programming Constructors gets invoked when object is created.

# Overloading 

Overloading is the name in which method or constructors can have same name but different parameters.

Compiler will choose which constructor or method gets invoked based on type of parameter passed.

The Process in which compiler chosing desired method or constructor is called overloading resolution.

If there is no match then compiler will throw error

```java
class A{
     A(){
     }
     A(int i){
     } 
    A(int i , String s){
    }
    A(String s,int i){
    }
    public void m1(int a){
    }
    public void m1(double a){
    }
}
```
```java
StringBuilder x = new StringBuilder();
StringBuilder y = new StringBuilder("sample");
```
## Method Signature 
name and parameters passed are method signature 

Return type not is in method signature.

If names and parameters are same and return type alone is different then it is not allowed in java.


# Default Field intialisation

There are three types  of variables according to scope
1. Instance
2. Static
3. Local

Instance : inside the class outside method

Static : Field inside class outside method with static keyword

Local : defined inside methods or blocks

Generally in java Values are default intialised for instance and static fields

For Local variables you must intialise values

Default values are 0 for numbers , false for boolean , null for object references

```java
class A{
  int i;
}
```
```java
A obj = new A();
System.out.println(obj.i); // prints 0
```
#  Constructor with no argument

Constructor with no argument is present inside most classes

It used to intialise some values 

IF there is no explicitly any constructors declared default constructors will be provided by compiler

compiler won't create default constructor if it sees one constructor declared explicilty

```java
class Book{
}
```
For above example compiler will automatically create default constructor

```java
class Employee{
private String name;
Employee(String name){
 this.name = name;
}
}
```
For above example compiler won't create default one

# Explicit Field intialsation 

If We need to explicitly intialisd the fields assign to field itself. 

This one will done before constructor invoked during object creation.

```java
class A{
   private int i = 10;
}
```
here i will intialsed with 10 before invoking of constructor


```java
class A{
private int i = nextId();
public void nextId(){
return 2*i*i + 1*i + 6;
}
}
```
We can also use methods to intialise the values
