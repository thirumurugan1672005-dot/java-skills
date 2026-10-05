# Restriction and Limitations of Generics 
## We cannot refer to static variables and methods in Type

```
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
	public void get(T...arr){
        for(T ele:arr){
			System.out.println(ele);
		}
		arr[0] = (T) Integer.valueOf(12);
	}
	private static T variable;
	public static  void setVariable(T var){
		variable = var;
	}
	public static  T newMethod(){
		 return variable;
	}
}
public class Third {
	
   public static void main(String[] args) {  
   
	 Pair<Integer> pair = new Pair<>(12,32);
	 pair.get(1,2,3,4);
	 pair.newMethod();
	 
	
   }
}

```
It simply becomes undefined method because T type is non static reference



## Exception handling
* You cannot extend Throwable in Generic Class
* You cannot use Type variable in catch clause
* You can throws , throw as it is checked in compile time but Type T must bounds to Throwable or its subclasses

```java

class Box<T> extends   Throwable{
	private T data;
	public T(int data){
		this.data = data;
	}
	public T getData(){
		return data;
	}
	public void setData(T data){
		this.data = data;
	}
}
```
```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The generic class Box<T> may not subclass java.lang.Throwable
        Return type for the method is missing
        Type mismatch: cannot convert from int to T

        at sample.Box.<init>(Third.java:3)
        at sample.Third.main(Third.java:19)
```
```java
package sample;

class Box<T> {
	private T data;
	
	public T getData(){
		return data;
	}
	public void setData(T data){
		try{
			if(data == null){
				throw T;
			}
			this.data = data;
		}
		catch(Exception e){
			System.out.println("exception");
		}
		catch(T ele){
			System.out.println("catched");
		}
	}
	
}
public class Third {
	
   public static void main(String[] args) {  
   
	 Box<Integer>box = new Box<>();
	 System.out.println(box.getData());
	 box.setData(1200);
	 System.out.println(box.getData());
	 box.setData(null);


	 
	 
	
   }
}

```
```
ull
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        T cannot be resolved to a variable
        No exception of type T can be thrown; an exception type must be a subclass of Throwable
        Cannot use the type parameter T in a catch block

        at sample.Box.setData(Third.java:12)
        at sample.Third.main(Third.java:31)
```
