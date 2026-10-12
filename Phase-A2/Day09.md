# Small Collections

* The of() method was used in set , list , map to create  unmutable collections
* They dont support mutable operations
* osEntries() from map lets you put entry inside the map

```java
package train;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
    	List<Integer> arr = List.of(1,2,3,4);
    	arr.forEach(System.out::println);
    	Set<Integer> set = Set.of(1,2,3);
    	set.forEach(System.out::println);
    	Map<Integer,Integer>map = Map.of(1,2,3,4);
    	map.forEach((k,v)->System.out.println(k+" "+v));
    	Map<Integer,Integer>map1 = Map.ofEntries(
    			Map.entry(1,2),
    			Map.entry(2,3),
    			Map.entry(4,5),
    			Map.entry(5,6)
    	);
    	map1.forEach((k,v)->System.out.println(k+" "+v));

        List<String>list = Collections.nCopies(10, "Hello");
    	list.forEach(System.out::println);
    	
    
    			
    	
  
    }
}

```

# copyOf 
* copyOf method as introduced so we can get immutable collections copy from mutable one
* they dont reflect each other

```java
package train;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
    	List<Integer> l  = new ArrayList<>();
    	for(int i=1;i<=5;i++) {
    		l.add(i);
    	}
    	List<Integer> arr = List.copyOf(l);
    	arr.forEach(System.out::println);
    	
    	Set<Integer> s = new HashSet<>();
    	for(int i=100;i<=500;i+=100) {
    		s.add(i);
    	}
    	Set<Integer> set = Set.copyOf(s);
    	set.forEach(System.out::println);
    	
    	Map<Character,Integer> map = new HashMap<>();
    	String str = "Pokemon";
    	for(int i=0;i<str.length();i++) {
    		map.merge(str.charAt(i), 1, Integer::sum);
    	}
    	Map<Character,Integer>map1 = Map.copyOf(map);
    	map1.forEach((k,v)->System.out.println(k+" "+v));
    	
    	
    	// change the list 
    	l.add(12);
    	
    	// change the set
    	s.add(12);
    	
    	// change the map
    	map.put('A',12);
    	
    	arr.forEach(System.out::println);
    	set.forEach(System.out::println);
    	map1.forEach((k,v)->System.out.println(k+" "+v));
    }
}

```
