# Generic Array List
* In C/C++ Arrays size is defined at compile time.
* In Java Arrays size can be done at runtime.
* ArrayLists is the dynamic in which size can be changed.

```java

import java.util.ArrayList;
class Employee{
   private int id;
   private String name;
   public Employee(int id,String name){
       this.id = id;
       this.name = name;
   }
   public int getId(){
      return id;
   }
   public String getName(){
      return name;
   }
}
class A{
   public static void main(String[] args){
       ArrayList<Employee> employees = new ArrayList<Employee>();
       ArrayList<Employee> employeesList = new ArrayList<>();
   }
}
```
* Collection of Employee references in which size can be changed dynamically.
* <> is diamond syntax
* compiler checks type of variables , methods,parameters.

# Using Local variables using var keyword
```java
var list = new ArrayList<Employee>();
```
* var keyword is used to list of array of object references.
* when using var keyword local variables don't use diamond syntax.

If use diamond syntax, it returns array list of objects
```java
var elements = new ArrayList<>();
```

* Before Java 5 Generics was not introduced
* ArrayList with raw type was used which can hold any objects.
* Because , it can store any objects of the class.
* We need to ensure this object has fields and methods


## add() : Add elements to the arraylist
* when add the elements to the arraylist , internal array of object references was used in the arraylist.
* Eventually array without memory,
* When elements are full to create bigger array and copy smaller to bigger ones.
## ensureCapacity(cap)
* make to ensure capacity to maintain copies the elements of array list.

```java
ArrayList<Employee>arr = new ArrayList<>(100); // ensure capacity of array list
```

## size()
size() determines the size of array list.

## trimToSize()
* trimToSize()  creates the trim the size of arraylist.
* Garbage Collector reclaims excess memory.

