# Restriction and Limitations in Generics 

## Arrays 

* Arrays are the one which accepts covariant types

```java
Pair[] p = new Pair[10];
Object[] obj = p;
```

* Arrays also holds types along with references it will throw ArrayStoreException
* It is safety net of Java Arrays

### Consequence :
* If the arrays allowed new T[]; it erased into Pair class 
* Now You cannot put String directly into it
* It only accepts Pair class after erasure and even accepts Pair<Employee>
* But can throw ClassCastException when calling getFirst() or any other methods
* So it was never allowed

### Loophole 
still we can make 
```java
Pair[] p = (Pair<String>[])new Pair<?>[10];
```
If you store Pair<Park> and use getFirst() method ClassCastException occurs 

It can accept any Pair class 

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
	
Pair<Integer>[]p = new Pair<Integer>[10];
	
   }
}

`
```


````

public class Third {
	
   public static void main(String[] args) {  
   
	Pair<?>[]p= new Pair<?>[10];
	p[0] = new Pair<Integer>(23,32);
	p[1] = new Pair<String>("Hello","World");
	
	Integer x = (Integer) p[0].getFirst();
	System.out.println(x);

	//p[0].setFirst(122);
	
   }
}
````
# Vargs 

```java
public <T> void m1 (T...arr){
   
}
```
* It will be converted to T[] though it has limitations
* But it has chance of ClassCastException
* It throws warnings use @SafeVarargs from Java 7 o supress warnings
* meaning for private methods(Java 9) , static , final  or constructors (@SafeVarargs works here in java 7)

# Generic Instances cannot be created 

* new T() we cannot make like this is compiler error.

# Fix 
```java
public <T> Pair<T> make(Supplier<T> supp){
  return new Pair<>(supp.get(),supp.get());
}
make(String::new);
```
```java
public <T> Pair<T> make(Class<T> supp){
  return new Pair<>(supp.getConstructor().newInstance());
}
make(String.class);
```

We can also make 

T[] a = (T[]) new Object[10]; or T[] a = (T[]) java.lang.reflect.Array.newInstance();

# Generic Array and Generic Class Array 
# Intialisation works for both
```java

class Box<T>{
    private T data;
    public Box(){
         
    }
    public T get(){
        return this.data;
    }
    public void set(T data){
        this.data = data;
    }
    public void sample(){
        T[]arr;
    }
}
public class Problem1{
    public static void main(String... args){
       Box<Integer>box[];
       Box<Integer>x = new Box<>();
       x.sample();
      
      
    }
}
```


```java
 Box<Integer>box[] = new Box<T>[10];
```
Error
```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        Cannot create a generic array of Box<T>
        T cannot be resolved to a type

        at Problem1.main(Problem1.java:19)
```
```java
T[]arr = new T[10];
```
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Cannot create a generic array of T

        at Box.sample(Problem1.java:14)
        at Problem1.main(Problem1.java:21)
```

## Now (1) Using Object Array if it is private 

```java
class Custom<T>{
    private T[] elements;
    private int size;
    public Custom(){
        this(0);
    }
    public Custom(int size){
        this.size = size;
        elements = (T[])new Object[size];
    }
    public void append(T ele){
        size++;
        T[]temp = (T[])new Object[size];
        for(int i=0;i<size-1;i++){
            temp[i] = elements[i];
        }

        temp[size-1] = ele;
        elements = temp;
    }
    public String toString(){
        StringBuilder ans = new StringBuilder();
        ans.append("[");
        for(int i=0;i<elements.length;i++){
            ans.append(elements[i]);
            if(i!=elements.length-1){
                ans.append(",");
            }
        }
        ans.append("]");
        return ans.toString();
    }

}
```
But it is not safe to return 

## Safe Version but Old fashioned 
```java
public static  <T> T[] createArray(Class<T>cls){
		T[]arr = (T[])Array.newInstance(cls, 10);
		return  arr;
	}
```
## Safe Version : Modern
```java
public static <T> T[]  createGenericArray(IntFunction<T[]>fun){
		T[]arr = fun.apply(2);
		return arr;
	}
```
