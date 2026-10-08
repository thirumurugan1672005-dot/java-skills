# Queue
* Queue is the last in first out
* Queue is the implemented by ArrayDeque and LinkedList implementations
* ArrayDeque is the implementation in which are of intial capacity

```
                        🔴 Iterable (interface)
                                |
                        🔴 Collection (interface extends Iterable)
                                |
+---------------------------------------------------------------------------+
               |                                                       |
         🔴 Queue (interface extebds Collection)               🔵 AbstractCollection (abstract class implements Collection)
         |                                                       |
  🔴 Deque (interface extends Queue)                             |
         |                                                       |
+----------------------------------------------------------------------  +
        |
 🔵 ArrayDeque (implements Deque extends AbstractCollection)

````
Queue also implemented by LinkedList 
