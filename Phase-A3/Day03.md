# How to catch multiple exceptions?
* We can also catch multiple exceptions
* As of java 7 we can also catch multiple exceptions in one clause seperated by | if not they are subclasses of each other
* e is implicity final meaning it cannot reference to other object , when you catch multiple exceptions seperated by |

* getMessage() : get the error information
* getClass().getName() : get the class of the exception
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


# Rethrowing and Catching Exceptions

1. You can handle the exception and rethrow the exception you are going to provide in catch clause
2. initCause() helps you to put the cause of exception into new exception currently thrown

```
When using checked exception if you throw you must declare it in header
```

```java
package simple;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

class FileUnCheckException extends Exception{
	public FileUnCheckException(String message) {
		super(message);
	}
}
public class Main {
	public static void m1() throws FileNotFoundException{
		 throw new FileNotFoundException("file not found");
	}
	public static void m2() throws IOException  {
		try {
			m1();
		}
		catch(FileNotFoundException e) {
			var err = new IOException("file unchecked");
			err.initCause(e);
		     throw err;
		}
	}
	

	public static void main(String... args)  {
	      
	       try {
	    	   m2();
	       }
	       catch(IOException e) {
	    	   System.out.println(e.getMessage());
	    	   System.out.println(e.getCause());
	       }
	       
	}
}

```

# Wrapping CheckedException inside RuntimeException

In some situations checked exceptions may not be thrown so we can wrap it in RuntimeException

```java
class A{
	public void run() {
		System.out.println("Running...");
	}
}
class B extends A{
	private void sample() throws SQLException{
		throw new SQLException("sql does not work");
	}
	public void run() {
		try {
			sample();
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
```


Before Java 7 Exception is declared type it does not know any specific things

As of Java 7 try blocks knows which exception thrown not based on declared type


