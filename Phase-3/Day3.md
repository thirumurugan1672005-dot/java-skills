# Predefined Class 

# Math 
* Math Class uses encapsulation so we cannot know its implementation but exposes data because it does not have to encapsulate it
* Math.PI

# Date Class 
* Date Class Represents a particular point of time

# Constructors
* Constructors is special kind of method which invoked when object is created
* They are basically have same name as class name
* They don't have return type not even void

# Object Variable (Reference Variable)

```java
Date date ;
```
It Was Intialised but it does not have any object yet 

If We try to invoke from this results in Runtime Error


```java
date = new Date();
```
Here That Reference variable assigned with reference to the object

Here new operator returns reference of Date class

Normally new Return reference of class in which constructor try to invoke

you can also create object by refers to another reference 

```java

Date startTime = date;
```
Now Both startTime  and date refers same Date object

Reference variable does not contain objects it has only reference to objects

You can expilictly set to null
```java
startTime = null;
```
Now It is no longer is associated with any object

Java If you try to access elements of null it throws NullPointerException

* If You abadon the object by there is no references to it it is automatically eligible for Garbage collection
* Garbage Collector automatically dismantles the objects if required
