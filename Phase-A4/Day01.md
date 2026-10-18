# Threads 

## MultiTasking

* Multiple tasks or programs executed simulataneoulsy in a machine
* Multitasking peforms by Os gets Cpu tiny slice of time and switch rapidly between them

## Thread 

Thread is the one part where the program executes

## Process and Thread 

* Process has unique variables
* It is hard to interprocess
* It gets more overhead to destroy and create process

* Thread share variables
* It is lightweight
* It gets less overhead for creating and destroying threads

# MultiThreading 

Programs use more than one thread in a time 


In java You implement by Thread class 

1. Create Runnable interface
2. since it is functional interface we are going to use lambda expression(block of code)
3. Create a runnable lambda expression
4. new Thread(r) where r is runnable block of code
5. start() method to start the thread


```java
package simple;

public class Simple {
	
	public static void print1() {
		for(int i=1;i<=100;i++) {
			int x = (i*2) + (i&1) + (i<<1);
			System.out.println(x+" "+i);
		}
	}
	public static void print2() {
		for(int i=101;i<=200;i++) {
			int x = (i>>3) + (i & 2) + (i*5);
			System.out.println(x+" "+i);
		}
	}
	

	public static void main(String[] args) {
		
         Runnable task1 = () -> {
        	 try {
				print1();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         };
         
         Runnable task2 = () -> {
        	 try {
				print2();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         };
         
         new Thread(task1).start();
         new Thread(task2).start();
	}

}

```



