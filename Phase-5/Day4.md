# Polymorphism

* Polymorphism is the one principle of object-oriented-programming.

## is-a relationship

is-a relationship states that every subclass object is a superclass object.

```java
class Employee{
}
class Manager extends Employee{
}
```

* In above program, Manager extends Employee means that Manager is a Employee
* so, subclass object is a superclass object.
* In above program, Employee does not extends Manager that Employee is not a Manager.
* so, superclass object is not a subclass object.
* Hence superclass reference can refers both superclass object and subclass object
* But Subclass references cannot refer the superclass object.

  ```java
  Employee e = new Employee(); // works
  e = new Manager(); // works
  Manager m = new Manager(); // works
  m = new Employee(); // produces run-time error
  ```

  # Dynamic binding

  * Suppose the program

  ```java
  class Animal{
    public void makeSound(){
       System.out.println("make sound");
    }
  }
  class Cat extends Animal{
      public void makeSound(){
        System.out.println("Meow");
     }
     public void jump(){
        System.out.println("jump");
     }
  }
  ```

  ```java

  Animal animal = new  Animal();
  animal.makeSound(); // prints make sound
  animal = new Cat();
  animal.makeSound(); // prints Meow!
  ```
  * First animal references to Animal object and calls the makeSound() calls the method prints "make sound"
  * Second animal references to Cat object and calls the makeSound() calls the method prints "Meow!"
  * Calling of methods depends on actual object here

  * This is called dynamic binding  because whatever object references calls the method depends on actual object type.

  ```java
  Animal animal = new Animal();
  animal.jump(); // won't work
  ```
  Because Specific Methods of subclass cannot be referred by superclass reference.

  
