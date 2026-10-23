
Optional interface is the way to represent T is present or not instead of null


# Getting default values 

orElse() gets default value if the optional is empty 
orElseGet() has a supplier interface which supplies value
orElseThrow() has Throwable class which can throw exception when there is no value

```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	
	public static void main(String... args)   {
		
	      Optional<String> ans = Optional.of("Hello");
	      
	      String a = ans.orElse("normal");
	      
	      System.out.println(a);
	      
	      String b = ans.orElseGet(()->"unknown");
	      System.out.println(b);
	      
	      String c = ans.orElseThrow(()-> new RuntimeException("value is empty!"));
	      System.out.println(c);
	      
	      try {
	    	  ans = Optional.empty();
	    	  a = ans.orElse("unknown");
	    	  System.out.println(a);
	    	  b = ans.orElseGet(()->"unknown");
	    	  System.out.println(b);
	    	  
	    	  c = ans.orElseThrow(()-> new RuntimeException("value is empty!"));
	    	  
	      }
	      catch(Exception e) {
	    	  System.out.println(e.getMessage());
	      }
	      
	       
	     
	}
}

```

# ifPresent or ifPresentElse 

* ifPresent() gets Consumer interface which consumes the value if present not gives output
* ifPresentElse() same as ifPresent for else condition here Runnable interface will work


```java
package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	
	public static void main(String... args)   {
		
	      Optional<String> ans = Optional.of("Hello");
	       
	      ans.ifPresent(System.out::println);
	      
	      ans = Optional.empty();
	      ans.ifPresentOrElse(v-> System.out.println(v), ()->{
	    	  System.out.println("Do this if it is not present!");
	      });
	      
	       
	     
	}
}

```

