
# Stream creation from other apis

* String.lines()
* Files.lines(Path)
* Scanner.tokens()
* Pattern.compile.splitAsStream
* All the methods create stream are some examples
```java
package simple;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Simple {
	
	
	public static void main(String[] args) throws IOException {
	
		String statement = "billion dollars they made\n So they will sleep peacefully\npeoples are fools";
		Stream<String> s = statement.lines();
		s.forEach(System.out::println);
		
		try(Stream<String>lines = Files.lines(Path.of("abc.txt"))){
			lines.forEach(System.out::println);
		}
		catch(Exception e) {
			
		}
		
		Stream<String> words1 = 
				Pattern.compile("\\PL+").splitAsStream(statement);
		
		Stream<String> words2 = new Scanner(statement).tokens();
		
		
		words1.forEach(System.out::println);
		words2.forEach(System.out::println);
      
	}

}

```

* Builder gives some optimisation
* toList() is the terminal operation
* Iterator and Iterable uses splititerator to create stream

```java
package simple;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Simple {
	
	
	public static void main(String[] args) throws IOException {
		
	   Stream.Builder<Integer>builder = Stream.builder();
	   for(int i=1;i<=5;i++) {
		   builder.add(i);
	   }
	   Stream<Integer>list = builder.build();
	   System.out.println(list.toList()); // turn into list 
	   
	   
	   ArrayList<Integer>arr = new ArrayList<>();
	   for(int i=1;i<=5;i++) {
		   arr.add(i);
	   }
	   
	   Iterator<Integer> it = arr.iterator();
	   Stream<Integer> s1 = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED), false);
	   
	   Iterable<Integer> iter = arr;
	   Stream<Integer> s2 = StreamSupport.stream(iter.spliterator(), false);
	   
	   s1.forEach(System.out::println);
	   s2.forEach(System.out::println);
	   
	   
	   
      
	}

}

```
