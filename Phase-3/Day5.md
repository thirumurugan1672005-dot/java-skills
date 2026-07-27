# Custom Class

```java
import java.time.LocalDate;

public class Employee{

    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;


    // methods

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(double s){
        salary = s;
    }
    public LocalDate getHireDay(){
         return hireDay;
    }
    public void setHireDay(LocalDate d){
          hireDay = d;
    }

     // constructors
    public Employee(String n,double s){
         name = n;
         salary = s;       
    }
}
```


* Instance Fields : Fields that represents state defined
* Methods : Defines Behaviour
* Constructors : Invokes When object creates , used for intialisation

```java
public class EmployeeTest {
    
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Ravi",1_00_000,2018,6,7);
        employees[1] = new Employee("Raj",1_50_000,2020,6,7);
        employees[2] = new Employee("Mohan",50_000,2025,8,7);
        for(Employee employee : employees){
             employee.raiseSalary(5);
        }
        for(Employee employee : employees){
             System.out.println(employee.getName()+"-"+employee.getSalary()+"-"+employee.getHireDay());
        }

        
    }
}
```
* public : accessible everywhere
* private : access within class
* Classes also has other class as instance fields
* Strongly recommend to make instance fields private


# Constructors 
* Constructors have same name as class name
* Constructors have no return type not even void
* Constructors helps to intialise intial values when object is created
* Constructors in java only called with new keyword
*  In Some Languages () directly but not in java
*  Class can have more than one constructors
*  constructors have zero , one or more parameters

If You don't put constructor compiler will create default constructor

Example:
```java
class Book{
 
}
class Main{
    public static void main(String[] args){
       Book obj = new Book();
    }
}
```

If You Explicitly create any constructor then compiler won't create default one

Example
```java
class Book{
  Book(String author){
     System.out.println("Author");
   }
}
class Main{
    public static void main(String[] args){
       Book obj = new Book(); 
    }
}
```
The above code won't compile since it did not found zero parameter constructor


* Not intoduce with local variables same name as instance fields this will create anamoiles

* Because in constructor when you do intialise it it will set to local variables itself does not change instance fields
