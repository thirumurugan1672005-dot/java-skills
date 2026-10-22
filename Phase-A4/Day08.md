# synchorised 

* synchorised is the keyword used from java 1.0 for locks and condiion objects
* synchorized method means it acquires lock and unlock when method finsihes
* wait() and notifyAll() acts like await() and signalAll()

* unfortunately there can be only one conditon object per object

```java
package simple;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Simple{
	public static int NACCOUNTS = 100;
	public static double INITIAL_AMOUNT = 1000;
	public static double MAX_AMOUNT = 1000;
	public static long DELAY = 10;
	public static void main(String[] args) {
		var bank = new Bank(NACCOUNTS,INITIAL_AMOUNT);
		
		for(int i=0;i<100;i++) {
			int from = i;
			Runnable task = () ->{	
				try {
					while(true) {
						int to = (int)(bank.size() * Math.random());
						double amount = MAX_AMOUNT * Math.random();
						bank.transfer(from, to, amount);
						Thread.sleep((int)(DELAY*Math.random()));
					}
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			};
			new Thread(task).start();
		}
		
		
	}
}

class Bank{
	
	private double[]accounts;
	
	
	public Bank(int naccount,double initialAmount) {
		accounts = new double[naccount];
		Arrays.fill(accounts,initialAmount);
	}
	
	public synchronized void  transfer(int from ,int to , double amount) {
	  
	   
		
		try{

			while(amount > accounts[from]) {
				wait();
			}
			System.out.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.println(amount+" transferred  from "+from+" to "+to);
			accounts[to] += amount;
			System.out.println("Balance : "+getTotalBalance());
			
			notifyAll();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
			
		
		
	}
	
	public synchronized double getTotalBalance() {
		
			double total = 0;
			for(double account:accounts) {
				total += account;
			}
			return total;
			
		
		
	}
	public int size() {
		return accounts.length;
	}
}

```
* It acquires lock on entry and releases when finishes
* Lock also releases when exception thrown
* locks are reeterant


# synchorized blocks 

it protects only this blockas takes lock object 

* Never use wrapper or string literal
* because String literals, wrapper are shared 


 ```java
 package simple;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Simple{
	public static int NACCOUNTS = 100;
	public static double INITIAL_AMOUNT = 1000;
	public static double MAX_AMOUNT = 1000;
	public static long DELAY = 10;
	public static void main(String[] args) {
		var bank = new Bank(NACCOUNTS,INITIAL_AMOUNT);
		
		for(int i=0;i<100;i++) {
			int from = i;
			Runnable task = () ->{	
				try {
					while(true) {
						int to = (int)(bank.size() * Math.random());
						double amount = MAX_AMOUNT * Math.random();
						bank.transfer(from, to, amount);
						Thread.sleep((int)(DELAY*Math.random()));
					}
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			};
			new Thread(task).start();
		}
		
		
	}
}

class Bank{
	
	private double[]accounts;
	private final Object lock =  new Object();
	
	public Bank(int naccount,double initialAmount) {
		accounts = new double[naccount];
		Arrays.fill(accounts,initialAmount);
	}
	
	public  void  transfer(int from ,int to , double amount) throws InterruptedException {
	  
	   
		
		synchronized(lock) {
			
			while(amount > accounts[from]) {
				lock.wait();
			}
			
			System.out.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.println(amount+" transferred  from "+from+" to "+to);
			accounts[to] += amount;
			System.out.println("Balance : "+getTotalBalance());
			
			lock.notifyAll();
		}	
	}
	
	public  double getTotalBalance() {
		synchronized(lock){
			
			double total = 0;
			for(double account:accounts) {
				total += account;
			}
			return total;
		}
			
		
		
	}
	public int size() {
		return accounts.length;
	}
}

  ```

* for static method use MyClass.class

- `synchronized(this)` ≡ synchronized instance method; `synchronized(MyClass.class)` ≡ static synchronized method.

