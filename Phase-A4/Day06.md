# Synchorisation

* In Real world problem when two or more threads access same data , it gets corrupted
* Two Threads try to access same data by methods they gets corrupted
* Such condition is called race condition
```java
package simple;

import java.util.Arrays;



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
	
	public void transfer(int from ,int to , double amount) {
	
		
		

			System.out.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.println(amount+" transferred  from "+from+" to "+to);
			accounts[to] += amount;
			System.out.println("Balance : "+getTotalBalance());
		
			
		
		
	}
	
	public double getTotalBalance() {
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

```cmd
975.0815270554093 transferred  from 82 to 88
Balance : 99316.92390432194
Thread[Thread-79,5,main]
838.6319332697859 transferred  from 79 to 77
Balance : 99316.92390432194
Thread[Thread-43,5,main]
823.3804731117772 transferred  from 43 to 27
Balance : 99316.92390432194
Thread[Thread-12,5,main]
102.42618160481275 transferred  from 12 to 88
Balance : 99316.923904322
Thread[Thread-68,5,main]
732.275568884 transferred  from 68 to 97
Balance : 99316.92390432202
570.310742468893 transferred  from 9 to 38
Thread[Thread-94,5,main]
149.6778377158965 transferred  from 94 to 13
Balance : 99887.23464679088
Thread[Thread-93,5,main]
281.5473524113913 transferred  from 93 to 69
Balance : 99887.23464679088
Thread[Thread-32,5,main]
```
So from above example the we dont know the how much it transferred 

But The money in bank should be constant but it is not it differs day by day

# Lock objects 

* Lock objects are used to give locks to threads such that if one thread accessing data another thread cannot access it same unitl unlocked
* Threads can access different data but accessing same data will be one thread at time


```java
package simple;

import java.util.Arrays;
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
	private Lock banLock = new ReentrantLock();
	
	public Bank(int naccount,double initialAmount) {
		accounts = new double[naccount];
		Arrays.fill(accounts,initialAmount);
	}
	
	public void transfer(int from ,int to , double amount) {
	   banLock.lock();
		
		try{

			System.out.println(Thread.currentThread());
			accounts[from] -= amount;
			System.out.println(amount+" transferred  from "+from+" to "+to);
			accounts[to] += amount;
			System.out.println("Balance : "+getTotalBalance());
		}
		finally{
			banLock.unlock();
		}
			
		
		
	}
	
	public double getTotalBalance() {
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
Thus corrupted data heavily reduced 

use unlock in finally block such that it work no matter whether exception occured or not 


oont use try with resources as it did not close by close method
