# Inner class 

* Inner class is the class which used to nest inside another class
* Inner class have properties differ from C++ nested class


```java
// How Members accessed from outerclass to inner class
class A{
	// instance fields
	private int x;
	// static variable
	private static int nextId;
	public A(int x) {
		this.x = x;
		nextId++;
	}
	// instance methods
	public void start() {
		System.out.println("Instance method start");
	}
	// static method
	public static void method() {
		System.out.println("Static Method start");
	}
	public void run() {
		B obj = new B();
		obj.start();
	}
	class B{
		public void start() {
			// Reference of outer class 
			A.this.start();
			System.out.println(A.this.x);
			
			A.method();
			System.out.println(A.nextId);
			
			
		}
	}
}
public class Third {
   public static void main(String[] args) {
	   A obj = new A(12);
	   obj.run(); 
   }
}
```
* Inner class access the instance members using reference (classname.this) refers to the instance members of outer class
* When constructor is called outer class the implicit parameter is automatically build in inner class
* Inner class access static members directly using class names 
