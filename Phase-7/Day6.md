# Method References

Method References are the when lambda does one thing not many

```java
(s) -> System.out::println
```

```java


public class Main {
	public static String[] applyFunction(String word) {
		String[] ans = word.split(" ");
		return ans;
	}
	public static String[] process(String word ,Function<String,String[]> fun) {
		return fun.apply(word);
	}
	
      public static void main(String[] args) {
    	
    	  String word = "Hello My name is Good boy";
    	  String [] ans = process(word,Main::applyFunction);
    	  System.out.println(Arrays.toString(ans));
    	 
  
    	 
      }
}

```

likewise 

1. object :: instanceMethod
2. Class :: instanceMethod -> which uses implicit parameter
3. Class :: staticMethod


