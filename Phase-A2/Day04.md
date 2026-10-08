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
         + -----------------------------------------------------------------------------+
                        |                                         |
               🔴 List (interface extends Collection)     🔵 AbstractCollection (abstract class implements Collection)
                        |                                         |
               + ---------------------------------------------------------------------------+
                    |      |
                    |---- 🔵 AbstractList (abstract class extends AbstractCollection implements List)
                    |      |
                    |---  🔵AbstractSequentialList ( abstract class extends AbstractList implements List)
                    |      |
                    |---- 🟢 LinkedList (concrete class extends AbstractSequentialList implements List,Deque)
                    

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
