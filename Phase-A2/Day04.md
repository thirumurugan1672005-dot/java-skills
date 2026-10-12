# Collection Heirarchy

# ArrayList 
* ArrayList has internal Object array implementations
* They have random access and expand and shrink

```java
ArrayList<Integer>arr = new ArrayList<>();
```

```
                                   🔴 Iterable (interface)
                                           |
                                   🔴 Collection (interface extends Iterable)
                                           |
         + -----------------------------------------------------------------------------+
                        |                                         |
               🔴 List (interface extends Collection)     🔵 AbstractCollection (abstract class implements Collection)
                        |                                         |
               + ---------------------------------------------------------------------------+
                    |      |
                    |---- 🔵 AbstractList (abstract class extends AbstractCollection implements List)
                    |      |
                    |---  🟢 ArrayList (extends AbstractList implements List)
         
         
```
```java


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>();
       arr.add(1);
       arr.add(2);
       arr.add(300);
       System.out.println(arr);
       arr.remove(2);
       System.out.println(arr);
       
       arr.forEach(ele ->{
    	   System.out.println(ele);
       });
    }
}
```

# LinkedList
* LinkedList is the implementation of list when need of more insertions and deletions
* traversing will cost effective but insertitons and deletions effective by using iterator ; By index it is O(n)
* implement as double linked list go both previous and next

```

                                   🔴 Iterable (interface)
                                           |
                                   🔴 Collection (interface extends Iterable)
                                           |
 ----------------------------------------------------------------------------------------------------------+
     |                                                     |                                         |
🔴 Queue (interface extends Collection)               🔴 List (interface extends Collection)     🔵 AbstractCollection (abstract class implements Collection)
     |                   |                                         |
🔴 Deque (interface extends Queue)               + ---------------------------------------------------------------------------+
     |                                                 |            |
     |                                                 |            |
     |                                                 |---- 🔵 AbstractList (abstract class extends AbstractCollection implements List)
     |                                                 |             |
     |                                                 |---  🔵AbstractSequentialList ( abstract class extends AbstractList implements List)
     |                                                 |            |
     | ------------------------------------------------|---- 🟢 LinkedList (concrete class extends AbstractSequentialList implements List,Deque)
                    

```
```java
package train;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
       List<Integer> arr = new LinkedList<>();
       arr.add(1);
       arr.add(2);
       arr.add(3);
       
       ListIterator<Integer> it = arr.listIterator();
       System.out.println(it.next());
       it.next();
       it.remove();
       //it.remove(); IllegalStateException
    }
}

```


```java
package train;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
     
    	ArrayList<Integer>arr = new ArrayList<>();
    	LinkedList<Integer>linked = new LinkedList<>();
    	
    	
    	// add elements in arraylist
    	arr.add(1);
    	arr.add(2);
    	arr.add(3);
    	
    	// add elements in linkedlist
    	linked.add(1);
    	linked.add(2);
    	linked.add(3);
    	
    	// add collection 
    	
    	ArrayList<Integer>a = new ArrayList<>();
    	a.add(100);
    	a.add(200);
    	a.add(300);
    	
    	
    	arr.addAll(a);
    	linked.addAll(a);
    	
    	
    	// remove element
    	
    	arr.remove(Integer.valueOf(200));
    	linked.remove(Integer.valueOf(200));
    	
    	
    	// remove condition
    	arr.removeIf(ele -> ele >200);
    	linked.removeIf(ele->ele < 100);
    	
    	// forEach to iterate
    	arr.forEach(System.out::println);
    	linked.forEach(System.out::println);
    	
    	// clear the list
    	arr.clear();
    	linked.clear();
    	
    	System.out.println(arr);
    	System.out.println(linked);
    	
    	
    	
    	
    	
    	
      
    }
}

```


