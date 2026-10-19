# Thread states 

* New State
* Runnable state
* Blocking
* Waiting
* Timed Waiting
* Terminated


## New state 

* Thread just created and task has not assigned to OS
* It is not yet running


```java

         Runnable task1 = () -> {
        	 try {
				print1();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         };
         
          Thread thread = new Thread(task1);
          System.out.println(thread.getState());
```

## Runnable State

* Runnable state in which it gets start for running
* There actual two states literally Ready and Running
* Ready : it was on the line of task
* Running : Thread is currently executing
* In this state threads are currently register to do the task

* Modern desktops and laptops use Preemptive Schelduing which means os assigns slice of time to os so the thread wont starve
* Here Threads running kepts changing for a time in order to all threads to execute

* Smart Devices uses cooperative schelduing so the thread lose control until the yield or when blocked or waiting

## Blocked and Waiting State

* When a thread requires to acquire intrinsic lock it becomes locked state
* When a thread waits for notification or signal it becomes waiting state
* When a thread waits a time it becomes timed waiting


## Terminated 
* When a thread stops by completing
* When a thread throws interrupt exception stops its execution

* stop() method was depreceated 


```java

public class Simple {
	
	public static void print1() {
		for(int i=1;i<=100;i++) {
			int x = (i*2) + (i&1) + (i<<1);
			System.out.println("thread 1"+Thread.currentThread().getState());
			System.out.println(x+" "+i);
		}
	}
	public static void print2() {
		for(int i=101;i<=200;i++) {
			int x = (i>>3) + (i & 2) + (i*5);
			System.out.println("thread 2"+Thread.currentThread().getState());
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
         
          Thread thread1 = new Thread(task1);
          System.out.println(thread1.getState());
         
          Thread thread2 = new Thread(task2);
          System.out.println(thread2.getState());
          
          thread1.start();
          System.out.println("Thread 1"+thread1.getState());
          
          thread2.start();
          System.out.println("Thread 2"+thread2.getState());
	}

}
```
