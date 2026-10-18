# Queue
* Queue is the FIRST In FIRST OUT (FIFO)
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


```java
package train;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
    	Queue<Integer>q = new ArrayDeque<>();
    	Queue<Integer>q1 = new LinkedList<>();
    	
    	for(int i=100;i<=400;i+=100) {
    		q.add(i);
    		q1.add(i);
    	}
    	
    	System.out.println(q.poll());
    	System.out.println(q1.poll());
    	
    	q.forEach(System.out::println);
    	q1.forEach(System.out::println);
    	
    	Deque<Integer>deque = new LinkedList<>();
    	for(int i=1000;i<=3000;i+=1000) {
    		deque.add(i);
    	}
    	deque.addFirst(1);
    	deque.addLast(2);
    	deque.forEach(System.out::println);
    	
    	System.out.println(deque.pollFirst());
    	System.out.println(deque.pollLast());
    	
    	deque.forEach(System.out::println);
  
    }
}

```
