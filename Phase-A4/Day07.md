# Condition objects 

* When the thread cannot execute until the condition is satisifed
* We use condition objects
* Lock can have one or more condition objects
* Without Locking condition objects used leads to IllegalMonitorStateException




* use While loop to check condtion again after thread resumes since it may be ok when it gives to signal

* await() puts the thread in waiting state and lock is released
* signalAll() signal to the all the threads in waiting on the same condition


* When thread cannot satisfy the condtion it becomes waiting state and releasing its lock.
* when another thread signalAll to signal the threead becomes runnable and Schelduer scheldues it
* Thread reacquires lock and resumes after await() only after rechecking condition if it satisfies
* Thread signalAll method should be called at the place modification may help another thread


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
	private Lock bankLock = new ReentrantLock();
	private Condition sufficientFunds  = bankLock.newCondition();
	
	public Bank(int naccount,double initialAmount) {
		accounts = new double[naccount];
		Arrays.fill(accounts,initialAmount);
	}
	
	public void transfer(int from ,int to , double amount) {
	   bankLock.lock();
		
		try{
           while(accounts[from] < amount) {
        	   
        	   sufficientFunds.await();
           }
        	   
        	   System.out.println(Thread.currentThread());
        	   accounts[from] -= amount;
        	   System.out.println(amount+" transferred  from "+from+" to "+to);
        	   accounts[to] += amount;
        	   System.out.println("Balance : "+getTotalBalance());
           
           
           sufficientFunds.signalAll();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally{
			bankLock.unlock();
		}
			
		
		
	}
	
	public double getTotalBalance() {
		bankLock.lock();
		try {
			double total = 0;
			for(double account:accounts) {
				total += account;
			}
			return total;
			
		}
		finally {
			bankLock.unlock();
		}
	}
	public int size() {
		return accounts.length;
	}
}

```
