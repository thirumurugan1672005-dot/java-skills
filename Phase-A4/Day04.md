

```java
package simple;

public class Simple {
	
	
	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			System.out.println(1/0);
		};
		
		new Thread(r1).start();
		System.out.println("executing fine");
		
		for(int i=0;i<=10;i++) {
			int x = i * 2 + (i<<2) + (i >>3) + (i ^7);
			System.out.println(x+" "+i);
		}
      
	}

}

```

When one thread throws exception only that thread dies remaining executes 


* Thread Group is the group in which thread belongs

```java
package simple;

public class Simple {
	
	
	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			System.out.println(1/0);
		};
		
		Thread t = new Thread(r1);
		t.setName("Thread-01");
		t.setUncaughtExceptionHandler((Thread th,Throwable e)->{
			System.out.println(th.getName());
			System.out.println(e.getMessage());
		});
		t.start();
		System.out.println("executing fine");
		
		for(int i=0;i<=10;i++) {
			int x = i * 2 + (i<<2) + (i >>3) + (i ^7);
			System.out.println(x+" "+i);
		}
      
	}

}

```
In this example we used threads own handler to handle the UnCaught Exception

thread group is asked and it goes to parent group if there is one.

Thread.setDefaultUnCaughtExceptionHandler() for all threads in whole group that did not have handler on thier own

ThreadDeath which arrives from Depreceates stop method

or else just print stack trace
