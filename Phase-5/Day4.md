# is-a relationship
is-a relationship states that subclass object is also super class object

# Runtime Polymorphism

Runtime Polymorphism or method overriding in which polymorphism occurs at runtime
```java
class Employee{
	public Employee(int id){
		this.id = id;
	}
    protected int id;
    public int getId() {
    	return this.id;
    }
    public void show() {
    	System.out.println("Employee");
    }
}
class Manager extends Employee{
	public Manager(int id) {
		super(id);
	}
	public void show() {
		System.out.println("Manager");
	}
}
public class Main {
      public static void main(String[] args) {
    	  
    	  Employee employee = new Employee(23);
    	  employee.show();
    	  
    	  Manager manager = new Manager(32);
    	  manager.show();
    	  
    	  Employee emp = new Manager(23);
    	  emp.show();
    	  
    	  // Manager manag = new Employee(23); This won't work
      }
}
```

# Dynamic binding

Dynamic binding is the binding in which method calls depends on type of object not the object variable.
```java
class Employee{
	public Employee(int id){
		this.id = id;
	}
    protected int id;
    public int getId() {
    	return this.id;
    }
    public void show() {
    	System.out.println("Employee");
    }
}
class Manager extends Employee{
	public Manager(int id) {
		super(id);
	}
	public void show() {
		System.out.println("Manager");
	}
}
public class Main {
      public static void main(String[] args) {
    	  
    	  Employee employee = new Employee(23);
    	  employee.show();
    	  
    	  Manager manager = new Manager(32);
    	  manager.show();
    	  
    	  Employee emp = new Manager(23);
    	  emp.show();
    	  
    	  // Manager manag = new Employee(23); This won't work
      }
}
```
But the Superclass object variable cannot access specific subclass methods or fields.

But Subclass object is not super class object which means Manager is a Employee while Employee is not a Manager

Using of superclass references instead of subclasses called covariant types 
