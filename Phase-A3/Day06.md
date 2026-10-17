# Custom Exception

Custom Exception occurs when you extends Exception or its subclasses 

```java
package simple;
class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
public class Main {
	public static void m1() throws MyException {
		throw new MyException("rare exception has occured");
	}
	public static void main(String... args)  {
		
	       try {
	    	   m1();
	       }
	       catch(Exception e) {
	    	   System.out.println(e.getClass().getName());
	    	   System.out.println(e.getMessage());
	       }
	}
}

```
We can make our own excpetions when built in did not have things we want
