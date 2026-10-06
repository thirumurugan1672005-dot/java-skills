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
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        Syntax error, insert "Dimensions" to complete ReferenceType
        Syntax error on token "p", delete this token

        at sample.Third.main(Third.java:19)
```

## Runtime limitations

* Types are erased at runtime in virtual machine

### instance of test 

* when you try to check instance of test like instanceof Pair<String> it will produce compiler error
* JVM knows only raw type not generic type
```java

    Object box1 = new Box<>();
    System.out.println(box1 instanceof Box<Integer>);
```
Error : 
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Type Object cannot be safely cast to Box<Integer>

        at sample.Third.main(Third.java:21)

```
Fix :

```java
     
		  Object box1 = new Box<>();
		  System.out.println(box1 instanceof Box<?>);
		  System.out.println(box1 instanceof Box);
```


### getClass 
* getClass test only returns the raw types
* It only checks raw types

```java
	Box<String> box = new Box<>();
    System.out.println(box.getClass());
```
``` class Box ```



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


````java
   Box a = new Box<String>();
		  Box<String>b = (Box<String>)a;

````
It compiles but with warning
