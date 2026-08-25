# Inheritance in interfaces

* Class can inherit multiple interfaces and it can extend only one class
* Ok everything occurs

# Scenario 1: Both interfaces have same abstract methods 
   1. It will not cause error since it is not implemented yet.
   2. It is going to override into one method in that class
# Scenario 2: Interfaces have same default methods atleast one have implementation
 1. You have to redefine in class orelse compiler will not able to find it
# Scenario 3 : Super class and interfaces have same method 
 Superclass overshadows interface methods

# Need of default methods
* In java 8 Collections has stream interface as default

## if it is not default

```java

class A implements Collection{
   
}
```
It wont compile so it becomes not source compatible

## if it from old jar file
 class still loads and but it is not binary compatible


 Making method default solves the problem



# Cloneable
Cloneable Interface used to create clones or copies of objects
# Records and Enums
Records and Enums can implement interface
# Sealed Interface
* Interface can be sealed so as its class which implements or interface it inherits sealed,non-sealed or final
* It is only extended by an interface or implemented by class which permits or present in same source file just like sealed classes

 # Inheritance within interface
 Interfaces can extend only single interface
