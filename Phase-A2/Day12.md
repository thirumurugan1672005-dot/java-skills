# Legacy Collections

# BitSet
* BitSet is the bitset that takes bit array and can peform bit operations
* set() set the bit on
* get() get the bit on or off
* clear() clear the ith bit (turn off)

```java
package train;

import java.util.Arrays;
import java.util.BitSet;

public class Main{
	
	public static void main(String[] args) {
		byte[]b = {1,2,3,4};
		System.out.println(Arrays.toString(b));
		BitSet bitSet = BitSet.valueOf(b);
		System.out.println(bitSet);
		System.out.println(bitSet.get(0));
		bitSet.clear(2);
		System.out.println(bitSet.get(2));
		bitSet.set(2);
		System.out.println(bitSet.get(2));
		
		
	}
}
```

# HashTable 
It is similar like hashmap but only required if you are working with Legacy Classes

```java
package train;

import java.util.Hashtable;

public class Main{
	
	public static void main(String[] args) {
		Hashtable<Integer,Integer>map = new Hashtable<>();
		map.put(1, 2);
		map.put(2, 3);
		map.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		
	}
}
```
# Properties
* They have keys and values are strings
* They are used to get set property
* They have also secondary table for default values

```java
package simple;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         var properties = new Properties();
         properties.setProperty("version","1.2");
         properties.setProperty("filename","C://Thiru");
         
         var out = new FileWriter("program.properties",
        		 StandardCharsets.UTF_8);
         properties.store(out, "Program Properties");
         var in = new FileReader("program.properties", 
        		 StandardCharsets.UTF_8); 
        		 
         properties.load(in);
         System.out.println(System.getProperty("user.name"));
	}

}

```
