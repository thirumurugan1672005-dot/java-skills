# Local Inner class 

```java


class A{	
	public void start() {
		class B{
			public void play() {
				System.out.println("play");
			}
		}
		B obj = new B();
		obj.play();
	} 
	
}
public class Third {
   public static void main(String[] args) {  
	   A obj = new A();
	   obj.start();
   }
}
```

* Local inner class is the class present inside method
* It scope ends with Method itself


```java

class A{	
	public void start() {
		class B{
			public void play() {
				System.out.println("play");
			}
			public void sleep(int time) {
				System.out.println(time);
			}
		}
		B obj = new B();
		obj.play();
		obj.sleep(1000);
	} 
	
}
```

*  passed the local variable and gets copy to the instance variable of object
