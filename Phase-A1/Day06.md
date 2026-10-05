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

# Vargs 

```java
public <T> void (T..arr){
}
```
* It will be converted to T[] though it has limitations
* But it has chance of ClassCastException
* It throws warnings use @SafeVargs from Java 9 o supress warnings
* meaning for private , static , final  or constructors (@SafeVargs works here)

# Generic Instances cannot be created 

* new T() we cannot make like this is compiler error.

# Fix 
```java
public <T> T make(Supplier<T> supp){
  return new Pair<>(supp.get(),supp.get());
}
make(String::new);
```
```java
public <T> T make(Class<T> supp){
  return new Pair<>(supp.getClassName().getConstructor());
}
make(String::new);
```

