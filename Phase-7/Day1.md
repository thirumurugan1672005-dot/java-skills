# Interfaces 

* Interfaces are the group of services which conforms to class
* The concept is if the interface is implemented make sure class implements this interface

```java
interface Movable{
  void move();
}
```
* If the class implements Movable interface it will make sure class implement that interface unless it is abstract
* All the methods in interface becomes public abstract by default

```java
class A implements Movable{
  public void move(){
     System.out.println("move");
  }
}
```
If the class implements method should be public otherwise the compiler will make it more restrictive


Class can implement multiple interfaces
for example
```java

interface Movable{
  public static final int SPEED = 12; //allowed from java
  void move();
}
interface Runnable{
   void run();
}
class A implements Movable,Runnable{
    public void move(){
      System.out.println("Moving");
    }
    public void run(){
       System.out.println("Running");
    }
   
}
```

* Interfaces cannot have constructor , instance fields , non final static fields
* only in java 8 they get allowing private methods which acts as helper methods and default methods are being allowed
* Interfaces all the fields become public static final (constants)

```java
A obj = new A();
```
```java
Runnable run = new A();
```
* Interface can also be used as object variable  .
* The objects of the variable must be class that implements interface

