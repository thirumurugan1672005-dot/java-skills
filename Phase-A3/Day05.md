# try with resources 
1. try with resources as from java 7 it can close the resources if the object implements AutoCloseable interface
2. try with resources will work even though it caught exceptions or not
3. try with resources as of java 9 can take effectively final variables

```java
package simple;

import java.util.Scanner;

public class Main {
	public static void main(String... args)  {
	     try(Scanner sc = new Scanner(System.in)){
	    	 int n = sc.nextInt();
	    	 System.out.println(n);
	     }
	     catch(Exception e) {
	    	 System.out.println(e.getClass().getName());
	     }
	       
	}
}

```
It automatically implements close() method 


Difficulty arises when the both original try and () within block throws exception

* The exception within resources block get supressed and addSuppressed into the original exception
* You can getSupressed methods in original exception

```java
package simple;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

class MyResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
	     System.out.println("Practically closed....");
	     throw new RuntimeException("Running failed ...");
		
	}
	
}
public class Main {
	public static void main(String... args)  {
	     try(var b = new MyResource();Scanner sc = new Scanner(System.in);)
	     {
	    	 int n = sc.nextInt();
	    	 
	     }
	     catch(Exception e) {
	    	 System.out.println(e.getClass().getName());
	    	 Throwable[] th = e.getSuppressed();
	    	 System.out.println(Arrays.toString(th));
	     }
	       
	}
}

```
