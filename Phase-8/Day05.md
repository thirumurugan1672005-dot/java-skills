# Static Inner class 
Static inner class is the same as inner class but they dont have reference to outer class 

```java
class A{
	static class B{
		public void move() {
			System.out.println("Moving ...");
		}
	}
}
public class Third {
   public static void main(String[] args) {  
	  A.B obj = new A.B();
	  obj.move();
   }
}

```
Classes defined interface , records ,enums are static and vice versa
