# Legacy Classes
## Enumeration

Enumeration was legacy interface before Iterable interface it helps to iterate elements

```java
package simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Main {
	

	public static void main(String... args) {
		List<Integer>arr = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			arr.add(i);
		}
		
		Enumeration<Integer> brr = Collections.enumeration(arr);
	      
		while(brr.hasMoreElements()) {
			System.out.println(brr.nextElement());
		}
		
	}

}

```
# Stack 
* Stack is legacy class which still used today
* It works based on Principle of Last in First Out
* Stack in which have peek , pop like operations

```java
package simple;

import java.util.Stack;

public class Main {
	

	public static void main(String... args) {
		
		Stack<Integer>stack = new Stack<>();
		stack.push(1);
		stack.push(100);
		System.out.println(stack.peek());
		stack.push(200);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.forEach(System.out::println);
	}

}

```
