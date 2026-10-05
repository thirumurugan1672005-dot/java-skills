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

