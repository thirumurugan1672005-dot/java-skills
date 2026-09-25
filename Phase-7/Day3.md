# Why Interfaces over abstract classes ?
Because class can extend only one abstract class while it can implement as many as interfaces it can

# Static and Private Methods
* As of Java 8 interfaces allowed static and private methods in interface
* private methods can be used only in interface and act as helper which can be static or instance
* static methods can be present only in interface
* Before Java 8 companion classes use static methods but now it is unnecessary

# Default Methods
* Default methods can be used in interface from java 8
* It does not have to worry about it implemented or not

# Why Default Methods ?
<p>Long ago,Collections interface was part of Java Standard library;
<br/>If the class Bag implements the interface it should implement the methods
<br/>But Later in java 8 they introduce stream() method in interface
<br/>If it is not default Now Bag class wont compile adding non default method makes source incompatible
<br/> But use already compiled jar file but when call by stream() method AbstractMethodError occurs
<br/> So it solves both problems
</p>

# Scenario 1: Both interfaces have same abstract methods 
   1. It will not cause error since it is not implemented yet.
   2. It is going to override into one method in that class
# Scenario 2: Interfaces have same default methods atleast one have implementation
 1. You have to redefine in class orelse compiler will not able to find it
# Scenario 3 : Super class and interfaces have same method 
 Superclass overshadows interface methods

# Comparator interface
Comparator Interface is the interface in which we use class to implement that interface to apply different classes as needed 
instead of applying to single class


# Cloneable
Cloneable Interface used to create clones or copies of objects
# Records and Enums
Records and Enums can implement interface
# Sealed Interface
* Interface can be sealed so as its class which implements or interface it inherits sealed,non-sealed or final
* It is only extended by an interface or implemented by class which permits or present in same source file just like sealed classes

 # Inheritance within interface
 Interfaces can extend only single interface
