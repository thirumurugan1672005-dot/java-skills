# Final Instance Fields
* Final Instance Fields means once intialised it can never modified.
* It must be intialised when the object is created.
* Final in primitive and non mutable reference type means we cannot change values and methods also cannot mutate it

```java
class A{
   private final int i;
   A(){
    this.i = 10;
   }
}
class B{
   private final int i = 20;
}
```

Example
```java
class Sample{
private final int i;
}
```
This will produce error Sample class should intialise final variable in its constructor

# Class Based Previliges

You think private is something hidden but methods of same class can access private fields

```java

class X{
   private int id;
   public String calculateStudentId(){
       int newId = id * 1000 + 1234;
       return "2026"+"Student"+newId;
   }
}
```

# Private Methods

* Generally Most methods are public .
* Sometimes some methods are helper methods which helps the methods inside class
* These Methods meant to be hidden since may have secret things which should not exposed.
* To Make Sure other classes never rely on this method.

```java

class A{
   private String passWordCreation(String password){
       byte[] passBytes = password.getBytes();
       
       for(int i=0;i<passBytes;i++){
           passBytes[i] = passBytes[i]*26 + passBytes[i]*32;
       }
      return passBytes.toString();
   }
}
```
# Implicit and Explicit Parameters

Implicit Parameters are parameters not explicitly mentioned in method declaration.

Explicit Parameters are parameters explicitly mentioned in method declaration.

```java
class A{
     public int sum(int a,int b){
          return a+b;
     }
}
class Sol{
   public static void main(String[] args) {
       A obj = new A();
       System.out.println(obj.sum(10,20));
   }
}
```
In the Above Code obj : implicit and a ,b are explicit

```java
class A{
  int i;
  public void setI(int i){
   this.i = i;
  }
}
```
this: implicit parameter (reference to current class to object)


