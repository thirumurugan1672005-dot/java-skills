# Simple and Bulk Operations
 There are also algorithms implemented either simple or bulk already baked in Collections 

```java
package simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	

	public static void main(String... args) {
		
		List<Integer> arr = new ArrayList<>();
		List<Integer> brr = arr;
		brr.add(1);
		System.out.println(arr);
		
		//copy method
		List<Integer> crr = new ArrayList<>();
		crr.add(0);
		Collections.copy(crr,arr);
		arr.add(3);
		
		System.out.println(arr);
		System.out.println(brr);
		System.out.println(crr);
		
		// retainAll  : bulk operation
		
		List<Integer>arr1 = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			arr1.add(i);
		}
		List<Integer> arr2 = new ArrayList<>();
		for(int i=1;i<=3;i++) {
			arr2.add(i);
		}
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr1.retainAll(arr2);
		System.out.println(arr1);
		
	}

}

```

# Arrays and Collections

```java
package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	

	public static void main(String... args) {
		
		List<Integer>arr = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			arr.add(i);
		}
		System.out.println(arr);
		
		Object[] obj = arr.toArray();
		// Integer[] i = arr.toArray(); compiler error
		
		System.out.println(Arrays.toString(obj));
		
		Integer[] i = arr.toArray(Integer[]::new);
		System.out.println(Arrays.toString(i));
	}

}

```
* Object[] array always returned
* So we can pass Integer[]::new type casted to Integer[] array you want
* We need to some conversion between array and collection


# Writting Your Own Generic Algorithm
* Use Interface as Generic in Collections
* Dont use specific implementations it may not be Generic At all
