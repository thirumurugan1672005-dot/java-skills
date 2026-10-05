# Restriction and Limitations of Generic Class 


## Primitive Types cannot be used in Generic Types 
* After Type Erasure Generic Types converted into Object class or its bounds
* But Primitive types cannot be formed into Object or any other class
* so Primitive types cannot be used in Generic Types
* Primitive Types have respective Wrapper classes

```java
List<int> arr; // produces compiler error
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
