# finally clause 

finally clause was there execute along with try statement

finally clause executes whether or not exception occurs 

```java
package simple;

import java.util.Scanner;

public class Main {
	public static void main(String... args)  {
	      Scanner sc = new Scanner(System.in);
	     try {
	    	 int n = sc.nextInt();
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
	     finally {
	    	 System.out.println("Closing Resources");
	    	 sc.close();
	     }
	       
	}
}

```
It is used for closing resources 

* finally can exist without catch clause

WARNING: finally you should not use return statement it will overshadow the original return statement

```java
package simple;

import java.util.Scanner;

public class Main {
	public static int m1(String s) {
		try {
			int n = Integer.parseInt(s);
			return n;
		}
		catch(Exception e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		}
		finally {
			return -1;
		}
	}
	public static void main(String... args)  {
	     System.out.println(m1("10"));
	       
	}
}

```
In this code always return -1 because of finally clause after throwing exception and return -1 

Never return , break,continue,throw statements inside finally clause because it might mask values and swallowed exceptions
