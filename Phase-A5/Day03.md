# filter()
filter() takes Predicate Interface which returns true or false 

# map()
* map has Function interface which takes one value and return value 
* map function is applied for every value of stream
# flatmap()
* sometimes function returns may be Stream
* flatmap() helps to flatten the results

# mapmulti()

* mapmulti() has BiConsumer which takes value from inputs and Consumer which consumes value 
* mapmulti() you can accept 0 ,1  or many times per element

Every method creates another stream not mutate any collection 

Everything mentioned is lazy operation and terminal operation makes pipeline runs
```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static   Stream<Integer> getStream(List<Integer>arr){
		return arr.stream();
	}
	
	public static void main(String... args)   {
		
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(12);
		arr.add(42);
		arr.add(45);
		
		
		List<Integer> list = arr.stream().filter(x->x>20).toList();
		
		System.out.println(list);
		
		
		list = arr.stream().map(x->x*2).toList();
		
		System.out.println(list);
		
		
		Stream<Stream<Integer>> s1 = Stream.of(1,2,3).map(x->Stream.of(x,x*10));
	     s1.forEach(s2->{
	    	 s2.forEach(System.out::println);
	     });
	     
	     Stream<Integer> s2 = Stream.of(1,2,3).flatMap(x->Stream.of(x,x*10));
	     s2.forEach(System.out::println);
	     
	     
	     Stream.of(1,2,3).<Integer>mapMulti((n,collector)->{
	    	 if(n%2==0)collector.accept(n);
	     });
	  
	  
	   
	     
	}
}

```


# limit() 
Extracts streams up to maximum size as this limit

# skip()
discards first k elements from stream 

# takeWhile()
takes element until the predicate is true 

# dropWhile()
yields the stream of element starting from where predicate is false

# concat()
concatenate the two stream

But we cannot concatenate infinite streams

```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	
	public static void main(String... args)   {
		
		
	  List<Integer>arr = new ArrayList<>();
	  for(int i=100;i<=1000;i+=100) {
		 arr.add(i);
	  }
	  List<Integer>a = arr.stream().limit(5).toList();
	  System.out.println(a);
	  
	  
	  List<Integer> brr = new ArrayList<>();
	  for(int x=1;x<=10;x++) {
		  brr.add(x);
	  }
	  List<Integer> b = brr.stream().skip(5).toList();
	  System.out.println(b);
	  
	  List<String>ans = List.of("apple","banana","grapes","ask","word","droid");
	  
	 List<String> c = ans.stream().takeWhile(x->x.length() > 3).toList();
	 System.out.println(c); 
	 
	 List<String> d = ans.stream().dropWhile(x->x.length() > 3).toList();
	 System.out.println(d);  
	   
	 Stream<Integer> s1 = Stream.of(1,2,3);
	 Stream<Integer>s2 = Stream.of(4,5,6);
	 Stream<Integer>s3 = Stream.concat(s1,s2);
	 s3.forEach(System.out::println);
	 
	     
	}
}

```
