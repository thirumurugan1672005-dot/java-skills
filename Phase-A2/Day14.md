# Generic Algorithms

* Generic Algorithms are very useful as it implements algorithm once and use on more datatypes

Few Algorithms like binary search and linear search , maximum element in array was implemented generic

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
	public static <T extends Comparable<T>> T maximumElement(Collection<T>col) {
		 if(col == null ||col.size() == 0) {
			 throw new NoSuchElementException("Give valid element");
		 }
		 
		 Iterator<T> it = col.iterator();
		 T max = it.next();
		 while(it.hasNext()) {
			 T ele = it.next();
			 if(ele.compareTo(max) > 0) {
				 max = ele;
			 }
			 
		 }
		 return max;
		
	}
	public static <T> int linearSearch(Collection<T> col,T find) {
		Iterator<T> it = col.iterator();
		int i = 0;
		while(it.hasNext()) {
			if(find == it.next()) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static <T extends Comparable<T>> int binarySearch(List<T>col,T find) {
	    if(col instanceof LinkedList) {
	    	return linearSearch(col,find);
	    }
	    int left = 0;
	    int right = col.size()-1;
	    while(left<=right) {
	    	int mid = left + (right-left)/2;
	    	if(col.get(mid).compareTo(find) == 0) {
	    		return mid;
	    	}
	    	else if(col.get(mid).compareTo(find) > 0) {
	    		right = mid - 1;
	    	}
	    	else {
	    		left = mid + 1;
	    	}
	    }
	    return -1;
	}

	public static void main(String... args) {
		
		List<Integer> arr = new ArrayList<>();
		arr.add(12);
		arr.add(63);
		arr.add(23);
		arr.add(34);
		Collections.sort(arr);
		
		Integer ele = maximumElement(arr);
		System.out.println(ele);
		
		System.out.println(linearSearch(arr,34));
		System.out.println(binarySearch(arr,23));
		
		// shuffle 
		System.out.println(arr);
		Collections.shuffle(arr);
		System.out.println(arr);
	}

}

```

## Sorting and Shuffling 
Collections class have variety of algorithms one such is sorting and shuffling
* shuffle method in Collections class lets to shuffle the list
* if it does not implement RandomAccess interface put into array shuffle and put back into list

* sort() method in collections lets to sort the elements which has Comparables but they need to modifiable  which supports set methods
* sort() method sorts the list

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
		arr.add(12);
		arr.add(63);
		arr.add(23);
		arr.add(34);
		Collections.shuffle(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
		
	}

}

```
## Binary Search
Binary Search Algorithm which already implemented works only sorted data which supports Random Access 

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
		arr.add(12);
		arr.add(63);
		arr.add(23);
		arr.add(34);
		
		Collections.sort(arr);
		System.out.println(Collections.binarySearch(arr,23));
		
		
	}

}

```
