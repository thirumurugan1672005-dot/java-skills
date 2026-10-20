# Introduction to Streams 

* When iterating elements using iterator it iterates over element and do the task using loops
* Iteration does not ue allows to own threads you should tell

* Streams work on what to do not how to do

## How Generally Stream creates ?
* Create a stream
* use intermediate operations to transform over stream and produces stream
* The terminal operation which uses lazy operations that precedes it . That produces result


* Stream does not store data ; it was in underlying collection or produce on demand
* Stream operations are lazy
* Stream operations dont mutate the collection and it may returns another stream

They are not executed until result is needed (lazy operation)


```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Simple {
	
	
	public static void main(String[] args) {
		
	   List<String>ans = new ArrayList<>();
	   ans.add("ans");
	   ans.add("apples");
	   ans.add("oranges");
	   ans.add("tiger");
	   ans.add("a");
	   
	   System.out.println(ans.size());
	   
	   int cnt =  (int)ans.stream().filter(x->x.length() > 3).count();
	   System.out.println(cnt);
      
	}

}

```


```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Simple {
	
	
	public static void main(String[] args) {
		
	  String[] arr = {"ask","ragul","poke","love"};
	  
	  // Create a Stream from array
	  Stream<String> stream  = Stream.of(arr);
	  stream.forEach(System.out::println);
	  stream.forEach(System.out::println);
      
	}

}

```
You cannot use stream twice it will throw IllegalStateException

* Collection has stream method to call streams
* Stream.of() method used as varargs or array to get streams


## Empty Streams 

Streams which are empty can be generated from empty() method 

## Infinite Streams

* generate() method takes supplier interface to get the outputs an infinite stream
* Supplier() called when value needed

* iterate() method uses unaryoperator to get input and get output
* fist it set seed and then apply function on called

```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Simple {
	
	
	public static void main(String[] args) {
		
	  Stream<String>emptyStream = Stream.empty();
	  
	  emptyStream.forEach(System.out::println);
	  
	  Stream<Double> infiniteStream = Stream.generate(Math::random);
	  
	  Stream<Integer>intStream = Stream.iterate(1,x->x+1);
	  
	  infiniteStream.limit(5).forEach(System.out::println);
	  intStream.limit(5).forEach(System.out::println);
      
	}

}

```
