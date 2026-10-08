# Interface in Collections 

```
             Iterable
                |
                |
             Collection
                |
                |
            _____________
           |     |      |
         List   Set    Queue
```
```java
package train;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        Iterable<Integer>it = arr;
        Iterator<Integer> iterator = it.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        iterator = arr.iterator();
        iterator.next();
        System.out.println(iterator.next());
        iterator.remove();
       // iterator.remove(); throws IllegalStateException
        
        // iterator.next(); throws NoSuchElementException
        iterator = arr.iterator();
        iterator.forEachRemaining((ele)->{
        	System.out.println(ele * 2);
        });
    }
}

```

Iterable : interface which has iterator() method to iterate the elements 
Iterator: iterator which actuall has methods to iterate it

Iterable :
iterator() : returns the iterator 
forEach() : implements the Consumer interface and iterate over elements 

Iterator:
next() : next element if not NoSuchElementException
hasNext()  : checking is there next elements 
remove():
1. not supported : UnSupportedOperationException
2. removing same next() call twice : IllegalStateException
3. removes the element

forEachRemaining() : takes the remaining elements in supplier interface
