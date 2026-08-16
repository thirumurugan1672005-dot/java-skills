# Preventing Classes and Methods from Inheritance 
* occasionaly most of them did not want our classes to be extended and used to modify and mess things up
* final classes are made to ensure it never be inherited by other classes
* for example String is final class which makes sure that it is String not any subclass

```java
final class Sample{
}
```
* if you make class as final everything inside it is final


* sometimes we need to make only few methods instead of whole class
* to prevent from few methods from overridden



* In early days of Java programming final was used to avoid overhead of dynamic binding
* yes dynamic binding brings overhead because it interfers the cpu in process of fetching next instruction during current process called inlining
* for example inling means e.getName() converts to e.name;
  
* compiler chooses method which is final not have chance to override as capable of inlining
* compiler will not inline if the method may have possibility of override because compiler won't know what code might be in runtime.

* just in time compiler in virtual machine notes method is simple,often called , not actually override into inling
* but if virtual machine loads the class which subclass which overrides the method optimiser undo the inling.


# Casting
Casting is the term used to describe forcing the type to target class type
```java
class Employee{
  private  int id;
   private double salary;
public double getSalary(){
return salary;
 }

}
class Manager extends Employee{
  private double bonus;
public double getBonus(){
}
}
```
```java
Employee[] employees = new Employee[3];
employees[0] = new Manager();
employees[1] = new Employee():
employees[2]=  new Employee():
```
* See employees[0] is the object of Manager but it temporarly forgets its type

* if compiler promises less like putting subclass reference or subclass object to superclass variable is called upcasting
* here no need to () casting
```java
Employee staff = new Manager();
```
* if compiler promises more subclass variable giving the superclass variable we need cast such casts are called downcasting
```java
Manager boss = (Manager)staff;
```
but sometimes we need to make sure it is Manager class or else it will produce ClassCastException

To avoid ClassCastException we use instanceof method 

```java
Employee staff = new Manager();
Manager boss;
if(staff instanceof Manager){
   boss = (Manager)staff;
}
```
Here if it is not instance it returns false

from Java 16
```java
if(staff instanceof Manager boss){
}
```
Able to intialise boss variable if it is instance of Manager 

# Patterns with instance of
## Pattern 1 with &&
```java
if(m instance of Manager boss && boss.getBonus()){
}
```
Checking with && is good because left is true right is going to executed
## Pattern with Conditional Operator ?
```java
double bonus = (m instanceof Manager boss) ?  boss.getBonus() : 0.0;
```
Accessing only returns true if it is false we dont use boss variable since when they are not working.

# Pattern with ||
since it is even false it executes next one . so it was avoided

## Avoid using Local variable same name as instance as it local variables overshadows here

# Protected Access

Protected Access was given class to use subclass and classes of same package

Protected Methods was more common to use give access only to subclass

