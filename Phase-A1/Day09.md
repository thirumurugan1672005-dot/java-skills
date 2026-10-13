# UnBounded Types
```java
package train;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		// see it accepts everything
		List<?>list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		// try to update null
		list.add(null);
		// try to read it
		Object obj = list.get(0);
		// try to add other than null
		//list.add("New Gift"); compiler error
		
	}
}
```

* UnBounded Types accepts same class of any generic types
* but they can write only null
* writting other data will throw compiler error
* They can read it as Object 
