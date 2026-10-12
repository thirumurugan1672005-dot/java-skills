# Maps 
* Maps are the structures where you have key associate with values
* There are two major implementation of map
  1. HashMap
  2. TreeMap
* HashMap uses hash function on keys while TreeMap uses compare function to provide sorted keys
* When you prefer sorted keys use TreeMap else HashMap because hash is faster

## Adding key,value to map
* put(key,value) method is used to put the keys and value
* keys are unique when you put again it will update with new value


```java

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    

      public static void main(String[] args)  {
		   Map<Integer,Integer>map = new HashMap<>();
		   map.put(0,1);
		   map.put(1,2);

		   map.forEach((k,v)->{
			   System.out.println(k+" "+v);
		   });
		   System.out.println("Map 2");
		   Map<Integer,Integer>map2 = new TreeMap<>();
		   map2.put(0,1);
		   map2.put(1,3);
		   map2.put(3,2);
		   map2.forEach((k,v)->{
               System.out.println(k+" "+v);
		   });
		   System.out.println("Map2 after removing :");
		   map2.remove(1);
		   map2.forEach((k,v)->{
               System.out.println(k+" "+v);
		   });
		   System.out.println(map2.size());
		   
	  }
}
```
forEach() uses BiConsumer to consumes two values

## Updating map 
* putIfAbsent() updates only the key is absent
* getOrDefault() : get if the key is presemt we can specify default value in absence of key
* merge((k,v,remapping function): key to map the function if the key is alredy present

```java

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void mapToCharacters(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.putIfAbsent(s.charAt(i), 0);
			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String s = "Hello World";
		mapToCharacters(s);
	}
}

```
```java
public static void mapToCharacters(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			int pre = map.getOrDefault(s.charAt(i), 0);
			map.put(s.charAt(i),pre+1);
		}
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
```

```java
public static void mapToCharacters(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.merge(s.charAt(i),1,Integer::sum);
		}
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
```
# Map views 
There are three views on maps
1. KeySet
2. Collection of values
3. Entry set (Key,value)pairs

* KeySet : Set the implements the class in which key belongs
* value collection : not a set but a collection
* entry set has key,value pairs

* in key view you can actually remove the key and remove in that associated map
* but in make no semse to add because  we cannot add key without a value in map.

```java

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		map.put(1, 2);
		map.put(2, 3);

		Set<Integer> keyset = map.keySet();
		for (int key : keyset) {
			System.out.println(key);
		}

		Collection<Integer> values = map.values();
		values.forEach(System.out::println);

		Set<Entry<Integer, Integer>> entryset = map.entrySet();
		entryset.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

	}
}

```


```java
package train;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        
    	HashMap<Integer,Integer>map = new HashMap<>();
    	IdentityHashMap<Integer,Integer>idmap = new IdentityHashMap<>();
    	WeakHashMap<Integer,Integer>weakMap = new WeakHashMap<>();
    	
    	
    	// put 
    	map.put(1,2);
    	map.put(12,3);
    	map.put(3,4);
    	
    	idmap.put(1,2);
    	idmap.put(2, 100);
    	idmap.put(500, 45);
    	
    	
    	weakMap.put(1,2);
    	weakMap.put(300, 3);
    	weakMap.put(4, 5);
    	
    	// get 
    	System.out.println(map.get(1));
    	System.out.println(idmap.get(1));
    	System.out.println(weakMap.get(1));
    	
    	// getOrDefault
    	System.out.println(map.getOrDefault(12, 0));
    	System.out.println(idmap.getOrDefault(12, 50000));
    	System.out.println(weakMap.getOrDefault(12, 50000));
    	
    	// compute
    	map.compute(12, (k,v)->{
    		return k*2+v;
    	});
    	idmap.compute(2, (k,v)->{
    		return k*2+v;
    	});
    	weakMap.compute(4, (k,v)->{
    		return k*2+v;
    	});
    	
    	
    	// computeIfAbsent
    	map.computeIfAbsent(15,(k)->{
    		return k * 2+32;
    	});
    	idmap.computeIfAbsent(15,(k)->{
    		return k * 2+32;
    	});
    	weakMap.computeIfAbsent(15,(k)->{
    		return k * 2+32;
    	});
    	// merge
    	map.merge(12,1,Integer::sum); 
    	idmap.merge(12,1,Integer::sum); 
    	weakMap.merge(12,1,Integer::sum); 
    	// print
    	map.forEach((k,v)->System.out.println(k+" "+v));
    	idmap.forEach((k,v)->System.out.println(k+" "+v));
    	weakMap.forEach((k,v)->System.out.println(k+" "+v));
    	// clear
    	map.clear();
    	idmap.clear();
    	weakMap.clear();
    	// size
    	System.out.println(map.size());
    	System.out.println(idmap.size());
    	System.out.println(weakMap.size());
  
    }
}

```
```java
package train;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        
    	HashMap<Integer,Integer>map = new HashMap<>();
    	IdentityHashMap<Integer,Integer>idmap = new IdentityHashMap<>();
    	WeakHashMap<Integer,Integer>weakMap = new WeakHashMap<>();
    	
    	
    	// put 
    	map.put(1,2);
    	map.put(12,3);
    	map.put(3,4);
    	
    	idmap.put(1,2);
    	idmap.put(2, 100);
    	idmap.put(500, 45);
    	
    	
    	weakMap.put(1,2);
    	weakMap.put(300, 3);
    	weakMap.put(4, 5);
    	
    	// get 
    	System.out.println(map.get(1));
    	System.out.println(idmap.get(1));
    	System.out.println(weakMap.get(1));
    	
    	// getOrDefault
    	System.out.println(map.getOrDefault(12, 0));
    	System.out.println(idmap.getOrDefault(12, 50000));
    	System.out.println(weakMap.getOrDefault(12, 50000));
    	
    	// compute
    	map.compute(12, (k,v)->{
    		return k*2+v;
    	});
    	idmap.compute(2, (k,v)->{
    		return k*2+v;
    	});
    	weakMap.compute(4, (k,v)->{
    		return k*2+v;
    	});
    	
    	
    	// computeIfAbsent
    	map.computeIfAbsent(15,(k)->{
    		return k * 2+32;
    	});
    	idmap.computeIfAbsent(15,(k)->{
    		return k * 2+32;
    	});
    	weakMap.computeIfAbsent(15,(k)->{
    		return k * 2+32;
    	});
    	// merge
    	map.merge(12,1,Integer::sum); 
    	idmap.merge(12,1,Integer::sum); 
    	weakMap.merge(12,1,Integer::sum); 
    	// print
    	map.forEach((k,v)->System.out.println(k+" "+v));
    	idmap.forEach((k,v)->System.out.println(k+" "+v));
    	weakMap.forEach((k,v)->System.out.println(k+" "+v));
    	// clear
    	map.clear();
    	idmap.clear();
    	weakMap.clear();
    	// size
    	System.out.println(map.size());
    	System.out.println(idmap.size());
    	System.out.println(weakMap.size());
  
    }
}

```
