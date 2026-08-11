# Inheritance Hierarchies

Inheritance Hierarchies is the collection of classes that extends each other

That chain is called Inheritance chain

## Java does not support multiple inheritance for classes 

### Diamond Ambiguity Problem
* When two classes becomes super class of one class 
* If they both have method with same name and parameters.
* Compiler will get confused and get ambiguity error
* Such Errors resolution will be complex in cpp and python
* Java avoids this problem for classes


# Polymorphism

PolyMorphism is the term used to denote have many forms

1. Compile Time Polymorphism
   Polymorphism occurs at compile time referred as method overloading

```java
class Addition{
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a ,double b) {
		return a+b;
	}
}
```
Methods with same name but different parameters either type or order changed is callled method overloading

The actual method is found by Method resolution.
