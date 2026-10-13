# Checked views amd Synchorized Views

```java
package train;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

import java.util.TreeMap;

public class Main {
	
    public static void main(String[] args) {
         List<String>arr = new ArrayList<>();
         Set<String> set = new HashSet<>();
         Map<Integer,Integer>map = new HashMap<>();
         
         
         arr.add("Simon");
         arr.add("Jack");
         arr.add("Master");
         arr.add("Hello");
         
         set.addAll(arr);
         
         map.put(1, 1);
         map.put(2, 3);
         map.put(0, 2);
         
         // raw collections
         List rawList = arr;
         Set rawSet = set;
         Map rawMap = map;
         
         
           // checked views
         List<String>listView = Collections.checkedList(arr,String.class);
         
         listView.forEach(System.out::println);
         
         
         rawList.add(new Date());
         
         rawMap.put("Hello","World");
         
         Map<Integer,Integer>syncMap = Collections.synchronizedMap(map);
         
         
         
   	   
    }
}

```
* Checked viwes are used to debug the prolem worn gtypes 
* Synchorized viwes created synchorized form of collections (thread-safe)
