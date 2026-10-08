# Collection Framework

Collections Framework is one of the important things in java

# Seperating Collections interfaces and implementations

for example 
1. Queue is interface in Collections
2. Queue has all the methods but does not have implementations on its own
3. Queue is First in First out
4. Implemented in two ways : Circular Array ; LinkedList
5. ArrayDeque and LinkedList are the classes used to implement the queue
6. When we know maximum capacity use ArrayDeque or else use LinkedList


```java
import java.util.*;
public class Third {
	
   public static void main(String[] args) {  
	
	 
	   Queue<Integer> q = new ArrayDeque<>(100);
	   q.add(1);
	   q.add(2);
	   q.add(3);
	   System.out.println(q.size());
	   q.remove();
	   System.out.println(q);
	   
	   // Change implementation to LinkedList
	   Queue<Integer>q1 = new LinkedList<>();
	   q1.add(1);
	   q1.add(2);
	   q1.add(3);
	   System.out.println(q1.size());
	   q1.remove();
	   System.out.println(q1);

	  
   }
}
```
# Collection framework

1. Collection interface has two most fundamanetal methods
2. add() and iterator() methods
3. add() returns true if the Collection successfully changes
4. add() returns false when there is no change in collection
5. iterator() returns iterator for iterating


# Iterator 
* Iterator is the interface in which elements iterate one by one
* next() method calls next element
* hasNext() checks whether there is next element
* next() method throws NoSuchElementException when there is no next element
* forEachRemaining(Consumer<T> ele) it consumes all the remaining elements
```java
import java.util.*;
public class Third {
	
   public static void main(String[] args) {  
	
	 
	  Collection<Integer> col = new HashSet<>();
	  
	  // add 
	  System.out.println(col.add(1));
	  System.out.println(col.add(1));
	  
	  System.out.println(col);
	  
	  col = new ArrayList<>();
	  for(int i=1;i<=5;i++) {
		  col.add(i);
	  }
	  
	  Iterator<Integer> it = col.iterator();
	  while(it.hasNext()) {
		  System.out.print(it.next()+" ");
	  }
	  System.out.println();
	  it = col.iterator();
	  
	  it.forEachRemaining((e)->{
		  System.out.println(e);
	  });
   }
}
```
Iterator when calling next() jumps to the next element and return the reference of element


remove() method removes element when last called by next()

```java
it = col.iterator();
it.next();
it.remove();
it.remove(); # ERROR
```
It throws IllegalStateException when try to remove without next()

Collection is generic utility methods 
