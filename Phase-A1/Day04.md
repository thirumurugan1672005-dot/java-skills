# Generic Expressions and Virtual machine

## Type Erasure 
* Type Erasure means the type parameters are erased into Raw Types
* Raw Types is the types of Ordinary Classes
* Type without bounds automatically converts to Object
* <T extends Comparable> turns into Comparable
* <T extends Serializible & Comparable> turns into Serializable and truns int Comparable casts when needed

## Translating Generic Expressions

* Generic Expressions are the expressions in which sometimes return Types get erased so it reutrn object
* At the time Compiler automatically inserts the casting to work

## Translating Generic Methods 
* Generic Methods are also translated into raw types
* Type Erasure gives some complications
* Bridge Methods are the methods which will resolve the issue

## Legacy code 
* Since virtual machine only ordinary class will be there
* It is backward compatible


## Before Type erasure

```java
class Box<T> {
  private T val;
  public void set(T val){
    this.val = val;
  }
}

```

```java
class StringBox extends Box<String>{
  @Override
  public void set(String val){
       super.set(val);
 }
}
```

## After Type Erasure 

```java
class Box{
  private Object val;

  public void set(Object val){
    this.val = val;
  } 
}
```

```java
class StringBox extends Box{
   @Override
   public void set(String val){
      super.set(val);
   }

    // bridge method
   public void set(Object val){
       set((String)val);
   }
}
```
