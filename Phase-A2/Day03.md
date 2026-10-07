# Collection interface 
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


* add(E) : add elements in the Collection
* remove(E): removes the elements in the Collection
* some collection classes did not implement throw UnSupportedOperationException
* addAll(Collection<E>) : add all the elements of collection
* clear() : clears the elements in collection
* retainAll() : retainAll the elements present both in collection
* size() : retruns the number of elements
* equals() : equal or not
* iterator() : iterator of collection
* removeIf() predicate interface in which passing condition satisifed to remove element

