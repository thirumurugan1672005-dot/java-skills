# Benefits of Encapsulation

* To make fields private
* To make methods to public acccessor and mutator

* Accessor checks sometimes to more than access it . it can also check who can access it
* Mutator checks error values cannot be set


```java
class Emp{
   private double salary;
   public double getSalary(){
      return this.salary;
  }
  public void setSalary(double salary){
      if(salary < 0){
        System.out.println("Salary should not be negative");
      }
      else{
        this.salary = salary;
      }
  }
}
```
