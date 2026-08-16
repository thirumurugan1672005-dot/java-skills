# Object Class
* Object is the cosmic superclass of every java classes.
* Object is the common ancestor of all the classes in java
* Java classes which does not extend other classes directly extends Object

# Here i need to describe three important methods
1. equals() method
2. hashCode() method
3. toString() method

# equals() method 
* equals() method is used to determine equal of the objects
* first default implementation equals to the same object

```java

public class Sample{
   public boolean equals(Object obj){
     return this == obj;
   }
}
```
How to use equals() method ?

```java
public class Employee{
  private int id;
  private double salary;
  public Employee(int id,double salary){
    this.id = id;
    this.salary = salary;
  }
  public boolean equals(Object obj){
    if(this == obj) return true;
    if(obj == null) return false;
    if(getClass() != obj.getClass()) return false;
    Employee employee = (Employee)obj;
    return this.id == employee.id && this.salary == employee.salary;
  }
}
```

* this refers to current reference if this == obj is true it means it is same object
* obj reference is null returns false it is not false

* i) When equals method is for notion for the single induvidual class use getClass() method matches the same class name or not.
* ii) when equals() method is for superclass as common use instanceof to test the class for all subclasses.
* When non null and class matched , cast into object of the class.
* return if the fields are equal return true else false.

Object.equals(a,b) method
* a = null or b = null it is false
* returns a.equals(b)




