# Constructor Refrences

Constructor references are used instead of the method of references to create class


```java
import java.util.ArrayList;
import java.util.stream.Stream;

 class Person{
	 private String name;
	 
	 public Person(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return this.name;
	 }
 }
public class Main {
	
	
      public static void main(String[] args) {
  
    	  ArrayList<String>names = new ArrayList<>();
    	  names.add("subash");
    	  names.add("alan");
    	  names.add("alien");
    	  names.add("madonna");
    	    
    	  Stream<Person> persons = names.stream().map(Person::new);
    	  System.out.println(persons.toList());

      }
}
```


When you use this keyword in the lambda expression it refers to instance of class in which method surronding the lambda present


# Free Variables

* Free Variables are the variables outside of lambda expressions
* They are effectively final which means they dont change
* Because they captured free variables pass to the block again
* so in order to avoid the updated or other value in thread conflicts
* It is mandatory free variable effectively final


```java

String word = "hello";
word = "greeting";
Runnable runnable = () ->{
System.out.print(word);
}
```
Above code results in compile error as it using variables potentially changing 
