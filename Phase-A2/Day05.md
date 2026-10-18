# Sets

HashSet and LinkedHashSet
```
                  🔴 Iterable (interface)
                         |
                  🔴 Collection (interface extends Iterable)
+--------------------------------------------------------------------+
               |                                   |
   🔴 Set (interface extends Collection)  🔵 AbstractCollection(abstract class implements Collection)
               |                                |
                -------------------------  🔵 AbstractSet (abstract class extends AbstractCollection implements Set)
               |                                |
    ----------------------------------------------- -----------------------------------------------------------+
        |                                       |
        |                     🟢 HashSet (concrete class extends AbstractSet implements Set)
        |                             |
        | ---------------------------------------------------
                                      |
                                🟢 LinkedHashSet(extends HashSet implements Set)

```
TreeSet
```
                  🔴 Iterable (interface)
                         |
                  🔴 Collection (interface extends Iterable)
+--------------------------------------------------------------------+
               |                                   |
   🔴 Set (interface extends Collection)  🔵 AbstractCollection(abstract class implements Collection)
               |                                                |
   🔴 SortedSet (interface extends Set)                         |
              |                                                 |
   🔴 NavigableSet (interface extends SortedSet)                |
             |                                                  |
  +----------------------------------------------------------------------------------------------+
         |
   🟢 TreeSet (set extends AbstractSet implements NavigableSet)

         

```

* HashSet is the collection in whcih we dont go over ordering instead searching of elements
* LinkedHashSet reterives order we insert
* TreeSet stores sorted order
* They use hash values based when override them
* IdentityHashMap is identity comparison
* for TreeSet elements passed must be class that implements a Comparable or pass Comparator interface

```java
package train;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

enum Size{
	SMALL,MEDIUM,LARGE,EXTRA_LARGE;
}
public class Main {
    public static void main(String[] args) {
     
    	HashSet<Integer>set = new HashSet<>();
    	
    	LinkedHashSet<Integer> lhashset = new LinkedHashSet<>();
    	
    	
    	for(int i=10;i>=1;i--)
    	{
    		set.add(i);
    		lhashset.add(i);
    	}
    	
    	set.forEach(System.out::println);
    	lhashset.forEach(System.out::println);
    	
    	
    	set.remove(1);
    	lhashset.remove(2);
    	System.out.println(set);
    	System.out.println(lhashset);
    	
    	
    	EnumSet<Size>enumSet = EnumSet.allOf(Size.class);
    	System.out.println(enumSet.add(Size.SMALL));
    	
    	enumSet.forEach(System.out::println);
    	EnumSet<Size> eSet = EnumSet.of(Size.SMALL);
    	eSet.add(Size.MEDIUM);
    	eSet.forEach(System.out::println);
    	
    	
    	TreeSet<Integer> treeSet = new TreeSet<>();
    	treeSet.add(1);
    	treeSet.add(-1);
    	treeSet.add(100);
    	treeSet.forEach(System.out::println);
    	System.out.println(treeSet.first());
    	System.out.println(treeSet.last());
    	
    	
    	
    	
    	
    	
    }
}

```
