# Interfaces 

* Interfaces are the group of services which conforms to class
* methods declared in interfaces automatically public abstract
* class implements interface using implements keyword.
* class can implements multiple interface
* class needs to implement all its methods

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
* only in java 8 they get allowing final static fields , private methods which acts as helper methods and default methods are being allowed

```java
A obj = new A();
```
```java
Runnable run = new A();
```
* Interface can also be used as object variable  . They get accessed only interface specific methods

