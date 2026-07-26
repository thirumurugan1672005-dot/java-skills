# Introduction to Object oriented Programming

Object Oriented Programming is the paradigm in which everything is made up of objects and behaviours operated on them]

1. Traditional Programming : algorithms first and then structuring data next
2. Oops : data first and algorithms next

# Class
Class is the one which helps to create objects . it defines what are the states and behavours an object can have

```java
class Sample{
   int i;
   public void run(){
    System.out.println("run");
   }
}
```

* The data present inside the class is called instance variables
* The behaviours present inside the class are called methods
* The State object holds is called current state of object

## Breif Introduction to Encapsulation

* Encapsulation tells the instance variables never exposed directly outside the class
* They must be manipulated only by methods inside the class
* This process packaging instance variables and methods together called Encapsulation
* It controls the Access and Hides the Implementation
* Class can change data how it stores data by using same method to manipulate it

## Breif Introduction to Inheritance

* Class can be extended by another class to acquire its members and functions
* There is actually cosmic class Object class which is super class for every class

# Objects

Objects are runtime instance of class 

Objects have three characterstics

1. behaviours : What can do ? what you can apply?
2. state : what are the things describes this object? what it stores?
3. Identity : unique identifier differentiates it from objects having same state and behaviour

```java

class Management{
     int noItems = 0;
     String status = "EMPTY";
     public void addItem(){
        if(status.equalsIgnoreCase("SHIPPED"){
            System.out.println("It is Shipped");
             return;
        }
        if(status.equalsIgnoreCase("EMPTY"){
           status = "Adding..";
        }
        noItems++;
     }
     public void removeItem(){
        if(status.equalsIgnoreCase("SHIPPED"){
            System.out.println("It is Shipped");
             return;
        }
        if(noItems == 0){
           status = "EMPTY";
           return;
        }
        noItems--;
     }
   }
  public void shipItem(){
      status = "SHIPPED";
  }
}
```

## Identifying Classes and Methods

Identify classes and methods we have to look for the nouns and verbs 
