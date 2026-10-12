# SubRanges 

## SubRanges in List 
* SubRanges in List we can use subList(index i ,index j) method from index i to index j - 1
* The resulting list is mutable and changes reflect on original list also
* subList() method can be used by classes implement List interface 
```java
package train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void printList(List<Integer>arr) {
		arr.forEach(System.out::println);
	}
    public static void main(String[] args) {
      // List 
    	ArrayList<Integer> arr = new ArrayList<>();
    	LinkedList<Integer> brr = new LinkedList<>();
    	
    	for(int i=1;i<=8;i++) {
    		arr.add(i);
    		brr.add(i*10);
    	}
     // subranges 
    	List<Integer> subArr = arr.subList(3,6);
    	List<Integer> subBrr = brr.subList(2,5);
    	
    	System.out.println("Print sublists");
    	printList(subArr);
    	printList(subBrr);
    	
    	subArr.add(12);
    	subBrr.add(13);
    	// print arrays 
    	System.out.println("Print arrays");
    	printList(arr);
    	printList(brr);
    	
    	
    	subArr.remove(Integer.valueOf(5));
    	subBrr.remove(Integer.valueOf(40));
    	
    	System.out.println("Printing List");
    	printList(arr);
    	printList(brr);
    	
    	subArr.clear();
    	subBrr.clear();
    	System.out.println("Next Printing List : ");
    	printList(arr);
    	printList(brr);
    	
    	
    }
}

```
## subset from SortedSet
* subset(from , to) ranges , headSet(from) , tailSet(to)

```java
package train;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void printSet(Set<Integer>arr) {
		arr.forEach(System.out::println);
	}
    public static void main(String[] args) {
      // Set 
    	SortedSet<Integer> arr = new TreeSet<>();
    	NavigableSet<Integer> brr = new TreeSet<>();
    	
    	for(int i=1;i<=8;i++) {
    		arr.add(i);
    		brr.add(i*10);
    	}
     // subranges 
    	SortedSet<Integer> sortedArr = arr.subSet(2,5);
    	SortedSet<Integer> sortedBrr = arr.headSet(2);
    	SortedSet<Integer> sortedCrr = arr.tailSet(4);
    	
    	
    	
    	
    	System.out.println("Print subsets");
    	printSet(sortedArr);
    	printSet(sortedBrr);
    	
    	
    	
    	
    	System.out.println("Print set");
    	printSet(arr);
    	
    	
    	sortedArr.remove(4);
    	sortedBrr.remove(Integer.valueOf(6));
    	sortedCrr.remove(3);
    	
    	System.out.println("Printing set");
    	printSet(arr);
    
    	
    	sortedArr.clear();
    	sortedBrr.clear();
    	sortedCrr.clear();
    	
    	System.out.println("Next Printing set : ");
    	printSet(arr);
    	
    	
    	
    }
}

```
## subSets (NavigableSet)
Here they even have whether is inclusive or exclusive from and to

```java
package train;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void printSet(Set<Integer>arr) {
		
		System.out.println("Printing Set..");
		arr.forEach(System.out::println);
	}
    public static void main(String[] args) {
      // Set 
    	
    	NavigableSet<Integer> brr = new TreeSet<>();
    	
    	for(int i=1;i<=8;i++) {
    		brr.add(i*10);
    	}
     // subranges
    	// not included both things only between
    	NavigableSet<Integer> Arr = brr.subSet(20,false, 40, false);
    	
    	NavigableSet<Integer> Brr = brr.headSet(20,false);
    	NavigableSet<Integer> Crr = brr.tailSet(40,true);
    	
    	
    	printSet(Arr);
    	printSet(Brr);
    	printSet(Crr);
    	
    	
    	
    	
    	
    	
    }
}

```
## maps (submaps)

* submaps are from maps they also affect the unde4rlying collection

```java
package train;

import java.util.Map;
import java.util.NavigableMap;

import java.util.SortedMap;

import java.util.TreeMap;

public class Main {
	public static void printMap(Map<Integer,Integer>map) {
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
    public static void main(String[] args) {
     
    	SortedMap<Integer,Integer>map = new TreeMap<>();
    	NavigableMap<Integer,Integer>navMap = new TreeMap<>();
    	for(int i=1;i<=10;i++) {
    		map.put(i,i*32+17);
    		navMap.put(i, i*43+97);
    	}
    	
    	// submaps 
    	SortedMap<Integer,Integer> subMap1 = map.subMap(3,8);
    	SortedMap<Integer,Integer> subMap2 = map.headMap(2);
    	SortedMap<Integer,Integer> subMap3 = map.tailMap(8);
    	
    	printMap(subMap1);
    	printMap(subMap2);
    	printMap(subMap3);
    	
        NavigableMap<Integer,Integer> navMap1 = navMap.subMap(3,false,8,true);
       NavigableMap<Integer,Integer> navMap2 = navMap.headMap(2,true);
       NavigableMap<Integer,Integer> navMap3 = navMap.tailMap(8,false);
    	
       printMap(navMap1);
   	   printMap(navMap2);
   	   printMap(navMap3);
   	   
   	   
   	   subMap1.clear();
   	   navMap1.clear();
   	   
   	   printMap(map);
   	   printMap(navMap);
   	   
    }
}

```
