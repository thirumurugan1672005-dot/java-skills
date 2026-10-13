# UnBounded Types
```java
package train;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		// see it accepts everything
		List<?>list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		// try to update null
		list.add(null);
		// try to read it
		Object obj = list.get(0);
		// try to add other than null
		//list.add("New Gift"); compiler error
		
	}
}
```

* UnBounded Types accepts same class of any generic types
* but they can write only null
* writting other data will throw compiler error
* They can read it as Object 

# SubType Bounds

```java
package train;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		
		List<? extends Number> list = new ArrayList<>();
		List<Integer> arr = new ArrayList<>();
		List<Double> crr = new ArrayList<>();
		List<Number> brr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		brr.add(2);
		brr.add(3);
		brr.add(4);
		
		crr.add(32.26);
		crr.add(12.34);
		
		System.out.println(arr);
		System.out.println(brr);
		System.out.println(crr);
		
		list.add(null);
		// list.add(22); compile time error
		
		list = arr;
		list.forEach(System.out::println);
		
		Number num = arr.get(0);
		
	}
}
```

* ? extends T so it can accept type extends type T
* It  can read and returns type T
* It can write only null
* It cannot write other things since it confuses between Integer,Double or anything

# SuperBounds 
```java

package train;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		
		List<? super Integer> arr = new ArrayList<>();
		
		arr = new ArrayList<Integer>();
		arr = new ArrayList<Number>();
		arr = new ArrayList<Object>();
		
		arr.add(1);
		System.out.println(arr.get(0));
		// It read as objects
		Object obj = arr.get(0);
		
	}
}
```
* SuperBounds accepts the ? super T T or its superclasses
* read as object
* we can also write here

#  Wildcard Catching

```java
package train;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void max(List<? extends Number> numList) {
		help(numList);
	}
	public static <T> void help(List<T> list) {
		T m = list.get(0);
		for(T ele : list) {
			if(m.toString().compareTo(ele.toString())<0){
				m = ele;
			}
		}
		System.out.println(m);
	}
	public static void main(String[] args) {
		
		List<Integer>arr = new ArrayList<>();
		arr.add(54);
		arr.add(45);
		arr.add(23);
		max(arr);
		
	}
}
```
* Wildcard Catching is the type in which the type cached assigned to something like #CFF and infers T=#CFF
* because ? cannot be used as variable type
* But be careful single definite types alone can catch not this List<Pair<?>> only List<?> this like 
