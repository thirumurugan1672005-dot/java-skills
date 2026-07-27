# Relationship between Classes

1. uses-a (dependency)
   uses-a (dependency) relation in one class depends on another class for some of its functionalities
   
2. has-a (Aggregation)
   has-a relationship in which class holds another class as state of instance variable
   
3. is-a (Inheritance)
   Class is special kind of its superclass

We need to less coupling between class in software engineering.

```java
class Order{
 public void payOrder(Account obj){
 }
}

```
In this Scenario We use Dependence Relationship in which payOrder we need Account class


```java

class Car{
   String brand;
   int noWheels;
   Tyre tyre;
}
class Tyre{
  String brand;
  String name;
}
```
In this Scenario We have Aggregated Relationship

```java
class Animal{
}
class Dog extends Animal{
}
```
In this Scenario Dog is special kind of animal (is-a) relationship
