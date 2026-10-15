# Errors
* Errors are the mistakes not at under our control
* For Errors you can gracefully the stop the program or atleast notify the user

* There are two ways to stop the error
  1. user allows to save the work and terminate
  2. Go back to safe state

## Major Errors
1. User Input Errors
2. Device errors
3. Physical limitations of RAM
4. Programming errors


# Older Days of Handling Exceptions
* In Older Days they return error code so that when we return -1 It is considereed error
* But Way we can take -1 as valid input for some operations
* It is not considered as good practice


# Exceptions 
* Java Exceptions throw the object of class that encapsulates error information
* It might check for handler mechanism which handles exception objects


# Throwable Interface
* Throwable interface is root of Exception heirarchy
* It can take message for error message

```
                             Throwable (interface)
                                  |
   +---------------------------------------------------------+
          |                                  |
        Error                            Exception
                                            |
  +-----------------------------------------------------------------+
  |                                                    |
  Other checked Exception                        RuntimeException

```
# Error 
* Error caused by many things like resource exhaustion
* Only thing we can do is gracefully end this program

# RuntimeException

* RuntimeException which are Programmers mistake

1. Null issure
2. index out of bounds

# CheckedException

FileNotFoundException is kind of exception that depends on environment not code

These kinds of exception are called checked exception

compiler forced to handle or just declare throws in method header 

* Errors and RuntimeException are unchecked
* While others are checked ones

# How to declare throws in Methods 

* Methods not only return values but also declares it might throw this checked exception when gone wrong
* It is bad idea to declare RuntimeExceptions in throws statement
* when method called in the other method
   1. It may declare same thing in header
   2. It may throw the exception
   3. It may handle the exception
* Error are beyond your control so avoid mention it
* For more than one exception mention seperate by commas
* throws specific Exception is nice enough to know where exception had occured


```java
package simple;

import java.io.IOException;

public class Main {
	public static void m1() throws IOException{
		throw new IOException("Exception occurs");
	}
	

	public static void main(String... args) {
	    m1();
	}

}

```
The above code throws Exception and pops message of error and traceback 

See the no handler catches so the current thread of execution terminates 

## Overriding rules

If the Superclass method did not throw exception
1. subclass method cannot throw exception

If the Super class method throws exception
1. subclass can have specific or none at all


