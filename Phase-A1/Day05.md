# Restriction and Limitations of Generic Class 


## Primitive Types cannot be used in Generic Types 
* After Type Erasure Generic Types converted into Object class or its bounds
* But Primitive types cannot be formed into Object or any other class
* so Primitive types cannot be used in Generic Types
* Primitive Types have respective Wrapper classes

```java
package sample;

class Pair<T>{
	private T first;
	private T second;

	Pair(T first , T second){
		this.first = first;
		this.second = second;
	}

	public T getFirst(){
		return this.first;
	}
	public T getSecond(){
		return this.second;
	}

	public void  setFirst(T first){
		this.first = first;
	}

	public void  setSecond(T second){
		this.second = second;
	}
}
public class Third {
	
   public static void main(String[] args) {  
	

	Pair<int> p = new Pair<>();
   }
}

```

Error message :
```
Third.java:32: error: unexpected type
        Pair<int> p = new Pair<>();
             ^
  required: reference
  found:    int
Third.java:32: error: cannot infer type arguments for Pair<>
        Pair<int> p = new Pair<>();
                      ^
  reason: cannot infer type-variable(s) T
    (actual and formal argument lists differ in length)
  where T is a type-variable:
```

## Runtime limitations

* Types are erased at runtime in virtual machine

### instance of test 

* when you try to check instance of test like instanceof Pair<String> it will produce compiler error
* JVM knows only raw type not generic type

```java
e instanceof Pair;
e instanceof Pair<?>;
```
The above code runs check either Pair or Pair of any type 

```java
e instanceof Pair<String>
```
It throws compiler error

### getClass 
* getClass test only returns the raw types
* It only checks raw types

### Casting 
```java
e = (Pair<String)x;
```
The above code gives warning and casted into only raw types 

The cast succeeds but produce ClassCastException elsewhere



```java
  public static void main(String[] args) {  
	

	Pair<Integer> p = new Pair<Integer>(1,2);
	 System.out.println(p.getClass());
	 Object o = new Pair<Integer>(12,13);
	 Pair<Integer> x = (Pair<Integer>)o;
	 System.out.println(x.getFirst());
   }
````
