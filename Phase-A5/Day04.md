# Other Stream Operations

```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	
	public static void main(String... args)   {
		
	      List<String> ans = new ArrayList<>();
	      ans.add("apple");
	      ans.add("papaya");
	      ans.add("apple");
	      ans.add("banana");
	      ans.add("orange");
	      
	       var a = ans.stream().distinct().toList();
	       System.out.println(a);
	       
	       var b = ans.stream().distinct().sorted().toList();
	       System.out.println(b);
	       
	       var c = ans.stream().distinct().sorted((x1,x2)->x1.length()-x2.length()).toList();
	       System.out.println(c);
	       
	       
	       ans.stream().peek(System.out::println).toList();
	       
	     
	}
}

```

# distinct()
distinct() means gets distinct() elements from stream though it cannot be contigious

# sorted()

sorted() sort based on Comparable objects or it takes Comparator 

# peek()
peek is used for debugging peek the elements one  by one 


# Reductions 

* Reductions is the terminal operations it reduces the stream to non-stream

* count() which counts the number of elements in stream
* min() , max() gives minimum , maximum

min() and max() returns Optional Type 


* anyMatch : it takes Predicate it returns anything matches with the predicate
* findFirst() : find first from the stream
* findAny() : Anything gets from stream
* allMatch() returns True if all mathces
* noneMatch() returns True if all not matches

```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	
	public static void main(String... args)   {
		
	      List<String> ans = new ArrayList<>();
	      ans.add("apple");
	      ans.add("papaya");
	      ans.add("apple");
	      ans.add("banana");
	      ans.add("orange");
	      
	       long cnt = ans.stream().distinct().count();
	       System.out.println(cnt);
	       
	       boolean isMatch = ans.stream().anyMatch(x->x.length() > 7);
	       System.out.println(isMatch);
	       
	       System.out.println(ans.stream().allMatch(x->x.length()>3));
	        var o  = ans.stream().noneMatch(x->x.indexOf("ch") >= 0);
	         System.out.println(o);
	         
	         System.out.println(ans.stream().findFirst());
	         System.out.println(ans.stream().findAny());
	       
	     
	}
}

```
findFirst() , findAny() also returns Optional type 
