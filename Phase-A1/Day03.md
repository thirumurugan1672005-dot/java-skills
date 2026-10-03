# Generic Methods

* Generic Methods are the methods may be inside generic class or in an ordinary class
* In Ordinary classes Generic Methods can be defined as after modifiers but before return type
* Such Type can be parameters , local variables or return type

```java
public class Third {
	public <T> T findSmallest(T[]arr) {
		if(arr == null || arr.length == 0) {
			return null;
		}
		T mini = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].compareTo(mini)< 0) {
				mini = arr[i];
			}
		}
		return mini;
	}
   public static void main(String[] args) {  
	
	   Third third = new Third();
	 String[] arr = {"Ask","Gian","A"};
	 String ele = third.<String>findSmallest(arr);
	 System.out.println(ele);
	 
	 Integer[]arr1 = {-1,2,3,-12};
	 int ele1 = third.<Integer>findSmallest(arr1);
	 System.out.println(ele);
	 
	  
   }
}
```

We can also infer types but it may produce error and do accordingly 


# Type Bounds 

* The above code wont survive becuase it does not whether it implements Comparable
* To restrict Types implements interface or extends Superclass
* extends is only keyword ; class first and interface next
* combine use & combine restrictions

```java
public <T extends Comparable> T findSmallest(T[]arr) {
		if(arr == null || arr.length == 0) {
			return null;
		}
		T mini = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].compareTo(mini)< 0) {
				mini = arr[i];
			}
		}
		return mini;
	}
```
