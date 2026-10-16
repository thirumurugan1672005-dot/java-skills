# How to Catch a exception

* If the program does not caught exception anywhere  the program is going to terminate the execution
* It is time to handle the exception

* If the method contains line that potentially causes exception it may handle it or propogate to the next caller by placing it in header of the method throws Exception

try-catch block
```java
package simple;

import java.io.FileNotFoundException;

public class Main {
	public static void m1() throws FileNotFoundException{
		throw new FileNotFoundException("file not found");
	}
	public static void main(String... args)  {
	   try {
		   m1();
		   System.out.println("executes");
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	   finally {
		   System.out.println("finally");
	   }
	}
}

```
* The try block is used to handle the code which may throw exception
* if the exception occured , the remainder of try block is skipped and move to catch block
* If the exception never occurs the catch block was never executed.

# Mention throws Exception to hand over to next caller

```java
package simple;

import java.io.FileNotFoundException;

public class Main {
	public static void m1() throws FileNotFoundException{
		throw new FileNotFoundException("file not found");
	}
	public static void m2() throws FileNotFoundException{
		m1();
	}
	public static void main(String... args)  {
	   try {
		   m2();
		   System.out.println("executes");
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	   finally {
		   System.out.println("finally");
	   }
	}
}

```

* The code describes In Overriddden method throws Exception cannot be declared if the super class method did not have one
* So if the method called in overridden method which might throw Exception you should handle it.
```java
package simple;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	public void run() {
		System.out.println("Running ... A");
	}
}
class B extends A{
	public void run() throws IOException {
		System.out.println("Running..... B");
	}
}
public class Main {
	
	public static void main(String... args)  {
	  B obj = new B();
	  try {
		  obj.run();
	  }
	  catch(Exception e) {
		  
	  }
	}
}

```
The aboce code terminates throw compiler error


If the super class method have throws declaration then only subclass method can have either specific excpetion or none at all.



