# Functional Interface

Functional Interface is the interface with only abstract methods

Java chose to use functional interface for the lambda expressions

## Why only one abstract method ?

Because it should not get confused by two abstract methods not implemented

There can be Object class methods or static , private , default methods ignored 


## Runnable 

* Runnable : return type void
* run action without arguments

```java

public class Main {
	   public static void clickButton(Runnable action) {
		   action.run();
	   }
      public static void main(String[] args) {
    	 clickButton(()->{
    		 System.out.println("Button clicked...");
    		 System.out.println("Loading ....");
    		 System.out.println("Working fine");
    	 });   
      }
}
```


## Function
One parameter : argument , one parameter : return type

```java

import java.util.function.Function;

public class Main {
	   public static void applyFunction(Function<String , String>function) {
		   String word = "EquALCase";
		   System.out.println(function.apply(word));
	   }
      public static void main(String[] args) {
    	
    	 
    	 applyFunction( s ->{
    		 return s.toLowerCase();
    	 });
      }
}
```


## Supplier

Supplies a value (get)

## Consumer

Consumes a value (return)

# Predicts
accepts none and returns boolean

