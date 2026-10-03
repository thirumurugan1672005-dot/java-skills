# Generic Class

```java

class CustomList<T>{
	Object [] arr;
	int size;
	CustomList(){
		arr = new Object[0];
	}
	public void add(T ele) {
		size++;
		Object other[] = new Object[size];
		for(int i=0;i<size-1;i++) {
			other[i] = arr[i];
		}
		other[size-1] = ele;
		
		arr = other;
	}
	public void remove(T ele) {
		int eleFind = -1;
		for(int i=0;i<size;i++) {
			String s = arr[i].toString();
			String t = ele.toString();
			if(s.equals(t)) {
				eleFind =  i;
			}
		}
		if(eleFind == -1) {
			System.out.println("Key does not exists");
		}
		else {
			Object[]other = new Object[size-1];
			for(int i=0;i<eleFind;i++) {
				other[i] = arr[i];
			}
			for(int i=eleFind+1;i<size;i++) {
				other[i-1] = arr[i];
			}
			arr = other;
			size--;
			other = null;
		}
	}
	public T get(int index) {
		if(index >= size) {
			System.out.println("Out of Bounds");
		}
		else {
			T ele = (T)arr[index];
			return ele;
		}
	}
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
public class Third {
   public static void main(String[] args) {  
	  CustomList<Integer>arr = new CustomList<Integer>();
	  arr.add(1);
	  arr.add(100);
	  arr.print();
	  arr.remove(1);
	  arr.print();
	  
	  
   }
}
```

* Generic Class have one or more Type Paramters
* Generic class have represented upper case letters in convention
* Type Paramter enclosed in angle brackets
* Type can beused in return type , parameter type , fields,local variables
* T[n] is not allowed

```java
class Pair<K,V>{
	private K key;
	private V value;
	public Pair(K key , V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
public class Third {
   public static void main(String[] args) {  
	 
	  Pair<String,Integer>pair = new Pair<>("Hello",1);
	  System.out.println(pair.getKey());
	  System.out.println(pair.getValue());
	  
   }
}
```
