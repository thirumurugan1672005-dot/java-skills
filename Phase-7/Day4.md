# Lambda Expressions

Lambda Expressions is the way in which block of code is used when called by another function

for example:
```java

import java.util.Arrays;
import java.util.Comparator;

class LengthComparator implements Comparator<String>{
	public int compare(String s , String t) {
		return s.length() - t.length();
	}
}
public class Main {
      public static void main(String[] args) {
    	
    	  
    	  String[] arr = {"Pokemon","World","Ash","Stancy"};
    	  Arrays.sort(arr,new LengthComparator());
    	  System.out.println(Arrays.toString(arr));
    	  
    	 
    	   
      }
}
```
In this example to pass a block of code 
1. Create class
2. put the method inside class
3. Create an instance of class
4. Pass the object

Lambda Expression provides a way to do it 

```java

import java.util.Arrays;
import java.util.Comparator;
public class Main {
      public static void main(String[] args) {
    	  
    	  String[] arr = {"Pokemon","World","Ash","Stancy"};
    	  Comparator<String>comp = (String s,String t)->s.length()-t.length();
    	  Arrays.sort(arr,comp);
    	  System.out.println(Arrays.toString(arr));
    	    
      }
}

```
Here we use block of code to describe no class no objects 


```java
  Comparator<String>comp = ( s, t)->s.length()-t.length();
```
Now Type can be inferred from the left hand side 

```java
Arrays.sort(arr,(s,t)->s.length()-t.length());
```
just pass the block of code now

