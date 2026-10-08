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
* They use hash values to compute based on identity
* for TreeSet elements passed must be class that implements a Comparable or pass Comparator interface
