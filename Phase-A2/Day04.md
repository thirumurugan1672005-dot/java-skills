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
