# Interrupted Threads 

Threads Stops

1. When method executes completely
2. When method returns
3. When uncaught Exception throws


interrupt() method can make a request for termination

when interrupt() called the boolean flag set to be interrupted 

when threads are sleep or wait checking threads interrupted cause exception

some are important we should handle exception finish task , some are not


```java
package simple;

public class Simple {
	public static void print() throws InterruptedException {
		for(int i=0;i<100;i++) {
			System.out.println(i);
			
			if(i % 10 == 0) {
				Thread.currentThread().sleep(5000);
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			try {
				Thread.currentThread().interrupt();
				print();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		new Thread(r1).start();
      
	}

}

```
Some Threads are interrupted put into sleep throws InterruptedException 


* When exception is thrown interrupted clears back(false)
* so in exception set back interrupted
* Better place throws in header

* interrupt threads wont go to sleep they throw exception immediately
* running thread must check flag itself it does not stop the thread from executing
* catch block should have interrupt() back (never leave it empty)
* finally runs after interrupt() for cleanup purposes
