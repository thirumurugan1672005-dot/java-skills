# How to catch multiple exceptions?
* We can also catch multiple exceptions
* As of java 7 we can also catch multiple exceptions in one clause seperated by | if not they are subclasses of each other
* e is implicity final meaning it cannot reference to other object now when you catch multiple exceptions

```java
package simple;

import java.util.NoSuchElementException;

public class Main {
	

	public static void main(String... args)  {
	       try {
	    	 System.out.println(1/0);
	       }
	       catch(ArithmeticException e) {
	    	   System.out.println(e.getMessage());
	       }
	       catch(ArrayIndexOutOfBoundsException e) {
	    	   System.out.println(e.getMessage());
	       }
	       catch(NoSuchElementException | NullPointerException e) {
	    	   System.out.println(e.getMessage());
	       }
	       
	       
	}
}

```

