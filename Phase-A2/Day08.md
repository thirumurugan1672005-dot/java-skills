# Weak Hash Map
* WeakHashMap is the hashmap collection in which the keys are weakly referenced.
* The values are still strongly referenced.
* since key is weakly referenced and they can be claimed by queue 
* GC can reclaims the object whenever GC  Runs
* Dont Surprise we cannot get key 


```java

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class Main {
	public static void main(String[] args) {

		Map<Integer, Integer> map = new WeakHashMap<>();
		map.put(0, 1);
		map.put(1, 2);
		map.put(2, 3);
		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		map.get(1);

	}
}

```
# LinkedHashMap and LinkedHashSet

* HashMap and HashMap access in random order
* LinkedHashMap and LinkHashSet changes access order in which order they insert 
* only the position in linkedlist of entries is changed  not hash table bucket
* It will always append the key recently searched at end of linkedlist
* So it was implemented as Least used in front of linkedlist

* removeEldestEntry() we can automate the process by implementing it


```java
	HashMap<Integer,Integer>map = new LinkedHashMap<>();
		map.put(2,3);
		map.put(4,5);
		map.put(-1,100);
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
	}
```
# Enumeration sets and Enumeration Maps
* They are implemented in Enum so they are just bits since enums have finite set of objects
* Enum Map where keys are Enum

```java
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

enum Size{
	SMALL(10),MEDIUM(20),LARGE(30),VERYLARGE(40);
	
	private int size;
	private Size(int size){
		this.size = size;
	}
	public int getSize(){
		return this.size;
	}
}
public class Main{

	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		EnumMap<Size,Integer>map = new EnumMap<>(Size.class);

		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});

		EnumSet<Size> set = EnumSet.allOf(Enum.class);

	}
}
```
# Identity HashMap
* HashMap where instead of hashCode() methods System.identityhasCode() method is used() to compute hashCode
* This class is useful for object serialization
* This class uses == not equals for comparison

```java
Map<Size,Integer>map = new IdentityHashMap<>();

		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
```
