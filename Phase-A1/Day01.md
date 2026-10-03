# Generic Programming 

Generic Programming is the concept in which one program can use multiple types 

# Before Java 5(2004)
* Java uses object class as inheritance to acheive generics
* It has two major problems
* 1) Compiler did not know which object it accepts
  2) It is required to cast before it used
* During TypeCasting there may be other data types are passed cause ClassCastException
```java

import java.util.*;
class CustomList{
	Object[] arr;
	int size;
	CustomList(){
		arr = new Object[0];
	}
	public void add(Object ele) {
		size++;
		Object other[] = new Object[size];
		for(int i=0;i<size-1;i++) {
			other[i] = arr[i];
		}
		other[size-1] = ele;
		
		arr = other;
	}
	public void remove(Object ele) {
		int eleFind = -1;
		for(int i=0;i<size;i++) {
			String s = arr[i].toString();
			String t = ele.toString();
			if(s.equals(t)) {
				eleFind =  i;
			}
		}
		if(eleFind == -1) {
			System.out.println("Key does not exists");
		}
		else {
			Object[]other = new Object[size-1];
			for(int i=0;i<eleFind;i++) {
				other[i] = arr[i];
			}
			for(int i=eleFind+1;i<size;i++) {
				other[i-1] = arr[i];
			}
			arr = other;
			size--;
			other = null;
		}
	}
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
public class Third {
   public static void main(String[] args) {  
	  ArrayList list = new ArrayList();
	  list.add(1);
	  list.add("Hello");
	  System.out.println(list);
	  CustomList custList = new CustomList();
	  custList.add(10);
	  custList.add(12);
	  custList.print();
	  custList.remove(10);
	  custList.print();
	  
	  
   }
}
````
## After Java 5(2004)
* Generics uses Type Parameter resolve the issue the type 
* Compiler know the type which is going to inserted
* Throw Compiler error when wrong type is used
* Compiler error is better than classcastException
* It also returns particular type.

```java

public class Third {
   public static void main(String[] args) {  
	  ArrayList<Integer>arr = new ArrayList<Integer>();
	  arr.add(1);
	  arr.add(100);
	  System.out.println(arr);
	  
	  
   }
}
```
