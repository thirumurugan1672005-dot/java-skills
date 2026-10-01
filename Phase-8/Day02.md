# Outer class access and create objects of inner class
```java
class A{
	public void start() {
		B obj = this.new B();
		obj.setX(100);
		System.out.println(obj.getX());
		B.m();
	}
	
	class B{
		private int x;
		private static int y;
		private static final int finalw = 20;
		public static void m() {
			System.out.println("static");
		}
		public int getX() {
			return this.x;
		}
		public void setX(int x) {
			this.x = x;
		}
	}
}
public class Third {
   public static void main(String[] args) {  
	   A obj = new A();
	   obj.start();
   }
}
```

* Inner class members are all accessed by outer class regardless of access modifiers
* Inner class objects this.Inner() to create inner class object


```java

class A{
	
	class B{
		private int x;
		private static int y;
		private static final int finalw = 20;
		public static void m() {
			System.out.println("static");
		}
		public int getX() {
			return this.x;
		}
		public void setX(int x) {
			this.x = x;
		}
	}
}
public class Third {
   public static void main(String[] args) {  
	   A obj = new A();
	   A.B obj1 = obj.new B();
		obj1.setX(100);
		System.out.println(obj1.getX());
		A.B.m();
   }
}
```
* This is how the inner class access outer class outside the scope
* With the help of outer class objects inner class objects created


```java

class A{
	
	private class B{
		private int x;
		private static int y;
		private static final int finalw = 20;
		public static void m() {
			System.out.println("static");
		}
		public int getX() {
			return this.x;
		}
		public void setX(int x) {
			this.x = x;
		}
	}
}
public class Third {
   public static void main(String[] args) {  
	   A obj = new A();
	   A.B obj1 = obj.new B();
		obj1.setX(100);
		System.out.println(obj1.getX());
		A.B.m();
   }
}
```

Note : only inner class can be private ; other class are public or package-visible 

Private inner class accessible only by Outer class 

The above code throws Exception 


* Access only by outer class members  for private class 
