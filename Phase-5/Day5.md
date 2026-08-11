
In java arrays of subclasses references can be converted to superclass references


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
	public void control() {
		System.out.println("Monitor");
	}
}
public class Main {
      public static void main(String[] args) {
    	  
    	   Manager[] managers = new Manager[3];
    	   for(int i=0;i<3;i++) {
    		   managers[i] = new Manager(i+1);
    	   }
    	   
    	   Employee[] employees = managers;
    	   for(int i=0;i<employees.length;i++) {
    		   employees[i].show();
    		  
    	   }
    	   
      }
}
```
```java
public class Main {
      public static void main(String[] args) {
    	  
    	   Manager[] managers = new Manager[4];
    	   for(int i=0;i<3;i++) {
    		   managers[i] = new Manager(i+1);
    	   }
    	   
    	   
    	   Employee[] employees = managers;
    	   for(int i=0;i<3;i++) {
    		   employees[i].show();
    		  
    	   }
    	   employees[3] = new Employee(5);
    	   for(int i=0;i<managers.length;i++) {
    		   managers[i].control();
    	   }
    	   
      }
}
```
This will throw ArrayStore Exception because It was declared as type of Manager References 


# Understand Method Calls
1. compiler looks the declared type of object and method name
2. compiler enumerates all the method with same name and all the methods of its super class
3. It avoids private methods of superclasses
4. compiler checks type of arguments supplied in call and chooses the one with right number of arguments which is called method overloading.
5. if there is no such type of parameters same as in supplied method call compiler prodcues error

# Method Signature
Name and Parameters are along called signature of method.

When you override return type must be compatible but in overloading return type is not a part of method signature.

# static binding
When a method is final,private,static or a constructor compiler knows exactly what to call is called static binding.

