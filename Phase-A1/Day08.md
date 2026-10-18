# Inheritance in Generic Types

* Generic Classes can be extended
* Pair<Manager> is not subtype of  Pair<Employee> though the actual classes Employee and Manager are subclasses

```java
package train;

class Employee{
	private int id;
	private String name;
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
	   this.name = name;
	}
	public String toString() {
		return this.getClass().getName().toString()+" [id="+this.id+",name="+this.name+"]";
	}
}
class Manager extends Employee{
	private double bonus;
	public Manager(int id,String name , double bonus) {
		super(id,name);
		this.bonus = bonus;
	}
	public Double getBonus() {
		return this.bonus;
	}
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}
class Pair<T>{
	private T first;
	public void setFirst(T first) {
		this.first = first;
	}
	public T getFirst() {
		return this.first;
	}
}
public class Main {
	
    public static void main(String[] args) {
         
         
         Employee employee = new Employee(12,"Kevin");
         Pair<Employee> emp = new Pair<>();
         emp.setFirst(employee);
         System.out.println(emp.getFirst());
         
         Manager manager = new Manager(12,"Max",1200);
         
         
         
         Pair<Manager> managers = new Pair<>();
         managers.setFirst(manager);
         System.out.println(managers.getFirst());
         
        // Pair<Manager> manage = emp; throws compiler error
         Pair pair1 = emp;
         Pair pair2 = managers;
         
         Pair<Manager> m = pair1;
         System.out.println(m.getFirst());
         
         
         
         
   	   
    }
}

```
It is to restrict Type Safety

*  Generic Types is subtype of its rawtype to ensure type safety and work with legacy classes

# WildCard 
* WildCard type parameter allowed to vary in generic types
* It is not used in class , it is used in parameters,variables not in class
* generic class should have bounded types

```java
package train;

import java.util.ArrayList;
import java.util.List;

class A{
	private int x;
	public A(int x) {
		this.x = x;
	}
	public int get() {
		return this.x;
	}
	public void set(int x) {
		this.x = x;
	}
}
class B extends A{
	private String name;
	public B(String name) {
		super(0);
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Pair<T>{
	private T data;
	public T getFirst() {
		return this.data;
	}
	public void setFirst(T data) {
		this.data = data;
	}
}
public class Main 
{
	
	public static void maxNumber(List<? extends Number> list) {
		double max = 0;
		for(Number num:list) {
			if(max < num.doubleValue()) {
				max = num.doubleValue();
			}
		}
		System.out.println(max);
	}
	
    public static void main(String[] args) {
         
         List<Integer> arr = new ArrayList<>();
         List<Double> brr = new ArrayList<>();
         
         for(int i=1;i<=6;i++) {
        	 arr.add(i);
        	 brr.add(i*32.45);
         }
         
         System.out.println(arr);
         System.out.println(brr);
         maxNumber(arr);
         maxNumber(brr);
         
         
         Pair<B> p = new Pair<>();
         
         Pair<? extends A> newPair = p;
         newPair.setFirst(null);
         //newPair.setFirst(new A(20));
         
    
    }
}

```
* We can read it but we can never update it
* We cannot even corrupt <?extends A> to store torhers anything to work
* Because it collapses whether it is A or B when we try to mutate it so  we can only read from it
* we can update only as null
