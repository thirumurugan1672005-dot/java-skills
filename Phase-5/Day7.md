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
   int id;
   double salary;
}
class Manager extends Employee{
  double bonus;
}
```
```java
Employee[] employees = new Employee[3];
employees[0] = new Manager();
employees[1] = new Employee():
employees[2]=  new Employee():
```

