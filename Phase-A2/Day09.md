# Small Collections (unmodifiable collections)

* The of() method was used in set , list , map to create  unmodifiable collections
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

# copyOf (unmodifiable copies)
* copyOf method as introduced so we can get unmodifiable copy from mutable one
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
# UnModifiable Views 
* in unmodifiable views it wont accept any mutable changes
* when collections provided gets changed views reflected unlike copies
* mutating things will throw UnsupportedOperationException

```java
package train;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=10;i++) {
        	arr.add(i);
        }
    	Collection<Integer> col = Collections.unmodifiableCollection(arr);
    	col.forEach(System.out::println);
    	
    	System.out.println("After changing: ");
    	arr.remove(Integer.valueOf(2));
    	arr.add(200);
    	col.forEach(System.out::println);
    	
    	
    	List<Integer> list = Collections.unmodifiableList(arr);
    	list.forEach(System.out::println);
    	
    	Set<String>set = new HashSet<>();
    	set.add("Hello");
    	set.add("World");
    	Set<String> s = Collections.unmodifiableSet(set);
    	s.forEach(System.out::println);
    	
    	set.add("Master");
    	s.forEach(System.out::println);
    	
    	NavigableSet<Integer> navSet = new TreeSet<>();
    	SortedSet<Integer> sortedSet = new TreeSet<>();
    	
    	NavigableSet<Integer>nav = Collections.unmodifiableNavigableSet(navSet);
    	SortedSet<Integer> sort = Collections.unmodifiableSortedSet(sortedSet);
    	
    	for(int x=1000;x<=5000;x+=1000) {
    		navSet.add(x);
    		sortedSet.add(x/10);
    	}
    	nav.forEach(System.out::println);
    	sort.forEach(System.out::println);
    	
    }
}

```

```java
package train;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
       HashMap<Integer,Integer>map = new HashMap<>();
       NavigableMap<Character,Integer>navMap = new TreeMap<>();
       SortedMap<Character,Integer> sortedMap = new TreeMap<>();
       
       
       // views 
       Map<Integer,Integer> mapview = Collections.unmodifiableMap(map);
       NavigableMap<Character,Integer>navView = Collections.unmodifiableNavigableMap(navMap);
       SortedMap<Character,Integer> sortView = Collections.unmodifiableSortedMap(sortedMap);
       
       for(int i=1;i<=10;i++) {
    	   map.put(i, i*32+12);
       }
       
       navMap.put('a', 22);
       navMap.put('A', 23);
       navMap.put('q', 45);
       
       
       sortedMap.put('z', 34);
       sortedMap.put('h', 45);
       sortedMap.put('f', 43);
       
       mapview.forEach((k,v)->System.out.println(k+" "+v));
       navView.forEach((k,v)->System.out.println(k+" "+v));
       sortView.forEach((k,v)->System.out.println(k+" "+v));
    	
    }
}

```
