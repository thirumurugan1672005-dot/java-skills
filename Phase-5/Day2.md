# Method Overriding
Method overriding means simply redefines the method of super class in subclass
```java

class Animal{
	public void makeSound() {
		System.out.println("Make Sound");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Meow!");
	}
}
public class Main {
      public static void main(String[] args) {
    	  Cat cat = new Cat();
    	  cat.makeSound();
      }
}
```
# Call a Super class method use super keyword
super keyword just makes compiler to awaken the super class method not contains its reference.

```java

class Staff{
	int id;
	String name;
	double salary;
	void raiseSalary() {
		this.salary+=0.05*salary;
	}
}
class AdminStaff extends Staff{
	void raiseSalary() {
		super.raiseSalary();// common raise
		this.salary+=0.02*salary; // exclusive for admin
	}
}
public class Main {
      public static void main(String[] args) {
    	  Staff staff = new Staff();
    	  staff.salary = 20_000.00;
    	  staff.raiseSalary();
    	  System.out.println(staff.salary);
    	  AdminStaff admin = new AdminStaff();
    	  admin.salary = 50_000;
    	  admin.raiseSalary();
    	  System.out.println(admin.salary);
      }
}
```
# Constructors in Inheritance
```java
class Staff{
	int id;
	String name;
	double salary;
	public Staff(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void raiseSalary() {
		this.salary+=0.05*salary;
	}
}
class AdminStaff extends Staff{
	
	void raiseSalary() {
		super.raiseSalary();// common raise
		this.salary+=0.02*salary; // exclusive for admin
	}
}
public class Main {
      public static void main(String[] args) {
    	  Staff staff = new Staff(12,"Ram",20_000.00);
 
    	  staff.raiseSalary();
    	  System.out.println(staff.salary);
    	  AdminStaff admin = new AdminStaff();
    	  
    	  admin.raiseSalary();
    	  System.out.println(admin.salary);
      }
}
```
* We get runtime Error for above Code that we don't have default constructor on superclass
* super() is used to invoke super class constructor
  
* When constructor is written without super() or this() super() is always present at first
line of constructor
* It automatically checks for default constructor in super class but we did not have default one instead we have only parametrized one.
* so we need to invoke super class constructor on our own with parameters

```java
class Staff{
	int id;
	String name;
	double salary;
	public Staff(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void raiseSalary() {
		this.salary+=0.05*salary;
	}
}
class AdminStaff extends Staff{
	AdminStaff(int id,String name,double salary){
		super(id,name,salary);
	}
	
	void raiseSalary() {
		super.raiseSalary();// common raise
		this.salary+=0.02*salary; // exclusive for admin
	}
}
public class Main {
      public static void main(String[] args) {
    	  Staff staff = new Staff(12,"Ram",20_000.00);
 
    	  staff.raiseSalary();
    	  System.out.println(staff.salary);
    	  AdminStaff admin = new AdminStaff(14,"Sam",45_000.00);
    	  
    	  admin.raiseSalary();
    	  System.out.println(admin.salary);
      }
}
```
This code avoids runtime error and runs successfully.
