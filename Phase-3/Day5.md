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

```
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
