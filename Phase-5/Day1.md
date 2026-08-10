# Inheritance

* Inheritance is one of the core-principal of oops
* Inheritance makes its one class extend states and properties from another class
* It is very helpful for code reusability.

## Terminologies
* SuperClass : Class from which properties and methods are inherited is called super class
* SubClass : Class which inherits the properties and methods from Base Class

## Defining SubClass

```java
class Base{
}
class Derrived extends Base{
}
```
use extends keyword to inherit the class 


```java
class A{
  private int x;
private void play(){
}
}
class B extends A{
}
```
private fields and methods won't be inherited.
